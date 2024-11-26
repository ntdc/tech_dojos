package com.ntatc.katas.funcprog.interface_fonc_lambda;

import java.time.LocalTime;

/**
 * Exercice : récupérer l'heure actuelle et déduire un message à retourner
 * <p>
 * Objectif : Utiliser l'interface fonctionnelle Supplier pour générer un message de bienvenue en fonction
 * de l'heure de la journée (par exemple, "Bonjour", "Bon après-midi", "Bonsoir").
 */
public class Exercice4 {

    public static String sans() {
        LocalTime now = LocalTime.now();

        int heure = now.getHour();  // Récupérer l'heure actuelle en utilisant getHour()

        String message;
        if (heure < 12) {
            message = "Bonjour !";
        } else if (heure < 18) {
            message = "Bon après-midi !";
        } else {
            message = "Bonsoir !";
        }

        return message;
    }

    public static String avec() {

        //TODO

        return null;
    }
}
