package com.ntatc.katas.funcprog.optional;

/**
 * Exercice 3 : Refactorisation d'une recherche avec gestion des erreurs
 * Objectif : Supprimer les blocs try-catch inutiles en utilisant orElseThrow.
 * <p>
 * Refactoriser :
 * - Transformez findUserById pour retourner un Optional.
 * - Utilisez orElseThrow pour gérer les erreurs.
 */

public class Exercice3 {

    public static void main(String[] args) {
        String user = findUserById(2);

        System.out.println(user);
    }

    public static String findUserById(int id) {
        String user = Exercice1.getUserById(id);
        if (user == null) {
            throw new IllegalArgumentException("Utilisateur non trouvé !");
        }
        return user;
    }
}
