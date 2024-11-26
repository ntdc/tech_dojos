package com.ntatc.katas.funcprog.interface_fonc_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Exercice : filtrage des nombres pairs
 * <p>
 * Objectif : Partir d'un code impératif qui filtre une liste d'entiers pour ne garder que les nombres pairs
 * et refactorer ce code en utilisant une interface fonctionnelle.
 */
public class Exercice2 {

    public static List<Integer> sans() {
        List<Integer> nombres = new ArrayList<>();
        nombres.add(1);
        nombres.add(2);
        nombres.add(3);
        nombres.add(4);
        nombres.add(5);

        // Filtrage impératif des nombres pairs
        List<Integer> result = new ArrayList<>();
        for (int n : nombres) {
            if (n % 2 == 0) {
                result.add(n);
            }
        }

        return result;
    }

    public static List<Integer> avec() {
        List<Integer> nombres = new ArrayList<>();
        nombres.add(1);
        nombres.add(2);
        nombres.add(3);
        nombres.add(4);
        nombres.add(5);

        // Interface fonctionnelle Predicate pour filtrer les nombres pairs
        Predicate<Integer> estPair = n -> n % 2 == 0;

        // Utilisation de la méthode filter pour appliquer le Predicate
        List<Integer> result = filtrerListe(nombres, estPair);

        return result;
    }

    public static List<Integer> filtrerListe(List<Integer> list, Predicate<Integer> predicat) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : list) {
            if (predicat.test(n)) {
                result.add(n);
            }
        }
        return result;
    }
}
