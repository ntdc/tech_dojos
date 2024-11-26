package com.ntatc.katas.funcprog.optional;

import java.util.Optional;


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
        String user = findUserById(2)
                .orElseThrow(() -> new IllegalArgumentException("Utilisateur non trouvé !"));
        System.out.println(user);
    }

    public static Optional<String> findUserById(int id) {
        return Exercice1.getUserById(id);
    }
}
