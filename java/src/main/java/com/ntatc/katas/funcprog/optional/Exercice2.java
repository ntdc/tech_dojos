package com.ntatc.katas.funcprog.optional;

import java.util.Optional;

/**
 * Exercice 2 : Suppression des vérifications if redondantes
 * Objectif : Simplifier le code en évitant des vérifications manuelles.
 * <p>
 * Refactoriser :
 * - Transformez la méthode printUser pour prendre un Optional et utilisez ifPresent ou orElse.
 */

public class Exercice2 {

    public static void main(String[] args) {
        Optional<String> user = Exercice1.getUserById(2);

        printUser(user);
    }

    public static void printUser(Optional<String> user) {
        user.ifPresentOrElse(
                name -> System.out.println("Bonjour " + name + " !"),
                () -> System.out.println("Aucun utilisateur trouvé.")
        );
    }
}
