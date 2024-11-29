package com.ntatc.katas.funcprog.optional;

/**
 * Exercice 2 : Suppression des vérifications if redondantes
 * Objectif : Simplifier le code en évitant des vérifications manuelles.
 * <p>
 * Refactoriser :
 * - Transformez la méthode printUser pour prendre un Optional et utilisez ifPresent ou orElse.
 */

public class Exercice2 {

    public static void main(String[] args) {
        String user = Exercice1.getUserById(2);

        printUser(user);
    }

    public static void printUser(String user) {
        if (user != null) {
            System.out.println("Bonjour " + user + " !");
        } else {
            System.out.println("Aucun utilisateur trouvé.");
        }
    }
}
