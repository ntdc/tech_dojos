package com.ntatc.katas.funcprog.optional;

/**
 * Exercice 5 : Chaining pour simplifier un pipeline
 * Objectif : Remplacer un code impératif par une chaîne de transformations.
 * <p>
 * Refactoriser :
 * - Transformez les étapes en un pipeline fonctionnel.
 */

public class Exercice5 {

    public static void main(String[] args) {
        processUser(1);
    }

    public static void processUser(int id) {
        Exercice1.getUserById(id)
                .map(String::toLowerCase)
                .filter(name -> name.contains("a"))
                .ifPresent(name -> System.out.println("Utilisateur valide : " + name));
    }
}
