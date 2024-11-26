package com.ntatc.katas.funcprog.optional;

import java.util.Optional;

/**
 * Exercice 4 : Simplification d’un traitement conditionnel
 * Objectif : Utiliser filter pour éviter les vérifications explicites.
 * <p>
 * Refactoriser :
 * - Remplacez les vérifications conditionnelles et transformations par filter et map.
 */

public class Exercice4 {

    public static void main(String[] args) {
        Optional<String> user = Exercice1.getUserById(2);

        System.out.println(getValidUser(user));
    }

    public static Optional<String> getValidUser(Optional<String> user) {
        return user.filter(name -> name.length() > 3)
                .map(String::toUpperCase);
    }
}
