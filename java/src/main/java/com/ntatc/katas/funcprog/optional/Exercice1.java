package com.ntatc.katas.funcprog.optional;

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
        String user = getUserById(2);
        if (user != null) {
            System.out.println("Utilisateur trouvé : " + user);
        } else {
            System.out.println("Utilisateur introuvable !");
        }
    }

    public static String getUserById(int id) {
        if (id == 1) {
            return "Alice";
        }
        return null;
    }
}
