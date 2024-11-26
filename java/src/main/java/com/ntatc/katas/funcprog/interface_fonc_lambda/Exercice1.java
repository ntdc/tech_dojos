package com.ntatc.katas.funcprog.interface_fonc_lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercice : transformation en majuscules
 * <p>
 * Objectif : Transformer chaque élément d'une liste en majuscule. Le code initial est impératif et doit être
 * refactoré en utilisant des interfaces fonctionnelles.
 */
public class Exercice1 {

    public static List<String> sans() {
        List<String> mots = new ArrayList<>();
        mots.add("bonjour");
        mots.add("monde");
        mots.add("java");

        // Transformation impérative en majuscules
        List<String> result = new ArrayList<>();
        for (String mot : mots) {
            result.add(mot.toUpperCase());
        }

        return result;
    }

    public static List<String> avec() {
        List<String> mots = new ArrayList<>();
        mots.add("bonjour");
        mots.add("monde");
        mots.add("java");

        // TODO

        return null;
    }
}