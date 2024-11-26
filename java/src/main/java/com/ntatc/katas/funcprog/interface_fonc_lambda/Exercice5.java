package com.ntatc.katas.funcprog.interface_fonc_lambda;

import java.util.function.BiFunction;

/**
 * Exercice : Calculer une somme
 * <p>
 * Objectif : Utiliser l'interface BiFunction pour effectuer une opération sur deux nombres : calculer leur somme.
 */
public class Exercice5 {

    public static Integer sans() {
        int a = 10;
        int b = 5;

        // Calculer la somme impérativement
        int somme = a + b;

        return somme;
    }

    public static Integer avec() {
        int a = 10;
        int b = 5;

        BiFunction<Integer, Integer, Integer> somme = (x, y) -> x + y;

        int resultatSomme = somme.apply(a, b);

        return resultatSomme;
    }
}
