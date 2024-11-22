# Cheat Sheet : Java Optional

## 1. Introduction

`Optional` est une classe utilisée pour éviter les `null` et gérer la présence ou l'absence de valeurs de manière
explicite et sécurisée.

---

## 2. Créer un Optional

| Méthode                      | Description                                                              |
|------------------------------|--------------------------------------------------------------------------|
| `Optional.of(value)`         | Crée un `Optional` contenant une valeur (ne doit pas être `null`).       |
| `Optional.ofNullable(value)` | Crée un `Optional` contenant une valeur ou `Optional.empty()` si `null`. |
| `Optional.empty()`           | Crée un `Optional` vide.                                                 |

**Exemple :**

```java
Optional<String> optional1 = Optional.of("Alice"); // Non nul
Optional<String> optional2 = Optional.ofNullable(null); // Peut être nul
Optional<String> optional3 = Optional.empty(); // Toujours vide
```

## 3. Accéder à la valeur d’un Optional

| Méthode                 | Description                                                                       |
|-------------------------|-----------------------------------------------------------------------------------|
| `isPresent()`           | Retourne `true` si une valeur est présente.                                       |
| `ifPresent(Consumer)`   | Exécute une action si une valeur est présente.                                    |
| `get()`                 | Récupère la valeur présente (Attention : lève une exception si vide !).           |
| `orElse(default)`       | Retourne la valeur si présente, sinon une valeur par défaut.                      |
| `orElseGet(Supplier)`   | Retourne la valeur si présente, sinon génère une valeur par défaut dynamiquement. |
| `orElseThrow(Supplier)` | Retourne la valeur si présente, sinon lève une exception personnalisée.           |

**Exemple :**

```java
Optional<String> optional = Optional.ofNullable("Bob");

optional.ifPresent(name ->System.out.println("Bonjour "+name));
String defaultName = optional.orElse("Utilisateur inconnu");
String dynamicName = optional.orElseGet(() -> "Nom généré");
String mandatoryName = optional.orElseThrow(() -> new IllegalStateException("Valeur manquante !"));
```

## 4. Transformer un Optional

| Méthode             | Description                                                         |
|---------------------|---------------------------------------------------------------------|
| `map(Function)`     | Transforme la valeur contenue dans l'`Optional`.                    |
| `flatMap(Function)` | Comme `map`, mais retourne directement un autre `Optional`.         |
| `filter(Predicate)` | Retourne l'`Optional` courant uniquement si la condition est vraie. |

---

### 4.1 Transformation avec `map`

La méthode `map` permet de transformer la valeur contenue dans un `Optional` si elle est présente.

**Exemple :**

```java
Optional<String> optional = Optional.of("Alice");

optional.map(String::toUpperCase).ifPresent(System.out::println); // ALICE
```

### 4.2 Chainer des Optional imbriqués avec flatMap

La méthode `flatMap` est utile lorsque la transformation renvoie un autre `Optional`, pour éviter les imbriquements et
chainer des transformations.

**Exemple :**

```java
Optional<String> firstName = Optional.of("Alice");
Optional<String> lastName = Optional.of("Smith");

Optional<String> fullName = firstName.flatMap(firstName -> 
    lastName.map(lastName -> firstName + " " + lastName)
);

fullName.ifPresent(System.out::println); // Alice Smith
```

### 4.3 Filtrer les valeurs avec filter

La méthode filter permet d'appliquer un prédicat pour conserver uniquement les valeurs répondant à une condition.

**Exemple :**

```java
Optional<String> optional = Optional.of("Alice");

// Filtrage : Conserve uniquement si le nom commence par "A"
optional.filter(name -> name.startsWith("A"))
        .ifPresent(System.out::println); // Alice

// Filtrage : Aucun affichage si la condition n'est pas remplie
optional.filter(name -> name.startsWith("B"))
        .ifPresent(System.out::println); // Rien
```

Bénéfices des transformations :

- Permettent de travailler directement avec la valeur encapsulée dans l'Optional.
- Évitent de devoir extraire manuellement la valeur.
- Simplifient les traitements grâce à une syntaxe fluide et expressive.

## 5. Exemple de refactoring

### Avant :

```java
String user = getUserById(1);
if (user != null && user.length() > 3) {
    System.out.println(user.toUpperCase());
} else {
    System.out.println("Utilisateur introuvable !");
}
```

- Le code utilise des vérifications explicites pour éviter les erreurs NullPointerException.
- Nécessite un bloc if imbriqué pour vérifier les conditions.
- Moins lisible et sujet à des oublis (par exemple, si on ne vérifie pas null).

### Après :

```java
getUserById(1)
    .filter(name -> name.length() > 3) // Filtre uniquement si la condition est respectée
    .map(String::toUpperCase)          // Transforme le nom en majuscules
    .ifPresentOrElse(
        System.out::println,          // Action à exécuter si une valeur est présente
        () -> System.out.println("Utilisateur introuvable !") // Action par défaut si vide
    );
```

- Le code devient plus lisible et fluide grâce à l'utilisation des méthodes d'Optional.
- Les vérifications null sont remplacées par des méthodes dédiées (filter, map, etc.).
- La gestion des cas où aucune valeur n’est trouvée est simplifiée avec ifPresentOrElse.