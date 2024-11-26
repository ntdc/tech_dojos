package com.ntatc.katas.funcprog.optional;

import java.util.Optional;

/**
 * Exercice 1 : Remplacement des null par Optional
 * Objectif : Montrer les problèmes des null et introduire Optional.
 * <p>
 * Refactoriser :
 * - Remplacez null par Optional dans la méthode.
 * - Utilisez orElse pour gérer les valeurs manquantes.
 */

public class Exercice1 {

    public static void main(String[] args) {
        Optional<String> user = getUserById(2);
        System.out.println(user.orElse("Utilisateur introuvable !"));
    }

    public static Optional<String> getUserById(int id) {
        if (id == 1) {
            return Optional.of("Alice");
        }
        return Optional.empty();
    }
}
