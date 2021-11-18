package com.ntatc.katas.leapyears;

public class LeapYears {
    /**
     * Permet de vérifier si l'année donnée est une année bissextile.
     *
     * @param annee l'année à tester
     * @return vrai si l'année est bissextile
     */
    public static boolean isLeapYears(int annee) {
        return annee % 4 == 0;
    }
}
