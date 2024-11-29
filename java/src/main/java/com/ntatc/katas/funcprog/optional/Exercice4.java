package com.ntatc.katas.funcprog.optional;

/**
 * Exercice 4 : Simplification d’un traitement conditionnel
 * Objectif : Utiliser filter pour éviter les vérifications explicites.
 * <p>
 * Refactoriser :
 * - Remplacez les vérifications conditionnelles et transformations par filter et map.
 */

public class Exercice4 {

    public static void main(String[] args) {
        String user = Exercice1.getUserById(2);

        System.out.println(getValidUser(user));
    }

    public static String getValidUser(String user) {
        if (user != null && user.length() > 3) {
            return user.toUpperCase();
        }
        return null;
    }
}
