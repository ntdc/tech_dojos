package com.ntatc.katas.funcprog.interface_fonc_lambda;

import java.util.ArrayList;
import java.util.List;

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

        // TODO

        return null;
    }
}
