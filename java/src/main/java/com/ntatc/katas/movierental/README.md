# Location de films

# TODO -> A DEPLACER

## Introduction

Vous êtes un développeur qui débarque sur le projet et qui doit l'améliorer sans changer le comportement de base.

### Modèle : Tape, Movie, Rental

### Customer (cible du refacto) :
- Nom
- Films loués
- Méthode généreation reçu

## Objectif
- Refacto (SOLID + Optimisation)
- Evolution : Nouvelle catégorie avec tarif, points fidélité, etc.

## Méthodologie

### Introduction / Tests
1. Présentation code
2. Pas de R.G. ou de documentation du comportement attendu ? (Pas le temps, "la vérité est le code existant")
3. Rappel de l'objectif (Tester et Refacto)
4. Définition du refacto (-> Pas de modification du comportement, pas de régression, pas de changement des APIs)
   41. Pas de refacto sans test
   42. Pas de refacto sans couverture "suffisante"
5. Ecrire un test cobaye avec une assertion fausse/échec (Formateur) -> passage "au vert"/succès avec un copier/coller du résultat actuel
6. Définition de la couverture de test
7. Couvrir le début du code (1 ou 2 tests)
8. Reparler de la couverture (Si ce n'est pas couvert, ce n'est pas testé, si c'est couvert, ce n'est pas forcément complètement testé. Pour assurer la couverture, on fait du mutation testing)
9. Ajouter le reste des tests (**Préparé à l'avance**)
10. Exécution des tests en mutation testing avec le plugin pitest

### Refacto
1. Regarder le feedback de l'IDE + SonarLint
2. Amener à effectuer les corrections proposées par Sonar
3. Citer les principes SOLID (dont Single Responsability et Open/Close)
4. Faire découper la méthode statement() en trois partie, une pour chaque morceau du reçu (Header/Footer/Body)
    41. Header (Génération simple)
    42. Body (Calcul du prix, incrémentation points fidélité, liste des réservations)
        Plusieurs boucles mais découpage SRP correct
    43. Footer (total prix, total points de fidélité)
        Le footer nécessite les données calculés par le body, il faut dupliquer le code des boucles, ce n'est pas grave car le code dupliqué n'est pas massif, bien qu'il devienne légèrement plus gros, le code complet restera plus lisible qu'avant
5. (Le calcul des points de fidélité n'est pas pertinent dans la partie body (Retirer de la génération du body)

### Evolution
Le refactoring est terminé ! On peut passer aux évolutions avec un nouveau type de film. (Horreur)
1. Attirer l'attention sur le switch du calcul du prix (Et si je veux ajouter un nouveau type de film (avec prix, etc.) ? (SOLID -> Open/Close))
2. Transformer les constantes de Movie en une énumération et adopter un modèle qui permet de retirer le switch (Pattern strategy)
3. Tester les apprenants : Que proposent-ils d'abord ? Les tests ou le dev ? (Réponse :  les tests)
4. Donner le cas de test et ses critères d'acceptation (A préparer à l'avance)





