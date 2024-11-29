package com.ntatc.katas.funcprog.interface_fonc_lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercice : affichage de chaque élément de la liste
 * <p>
 * Objectif : Utiliser l'interface fonctionnelle Consumer pour appliquer une opération
 * (afficher chaque élément) sur chaque élément d'une liste.
 */
public class Exercice3 {
//
    public static void main(String[] args) {
        System.out.println("Sans :");
        sans();

        System.out.println("\\|");

        System.out.println("Avec :");
        avec();
    }

    public static void sans() {
        List<String> mots = new ArrayList<>();
        mots.add("bonjour");
        mots.add("monde");
        mots.add("java");

        // Afficher chaque élément de la liste de manière impérative
        for (String mot : mots) {
            System.out.println(mot);
        }
    }

    public static void avec() {
        List<String> mots = new ArrayList<>();
        mots.add("bonjour");
        mots.add("monde");
        mots.add("java");
    }
}
