package com.ntatc.katas.mars;

public enum Direction {

    NORD(new MouvementNord2D()),
    SUD(new MouvementSud2D()),
    OUEST(new MouvementOuest2D()),
    EST(new MouvementEst2D());


    private final Mouvement2D mouvement2D;

    Direction(Mouvement2D mouvement2D) {
        this.mouvement2D = mouvement2D;
    }

    public Mouvement2D getMouvement2D() {
        return mouvement2D;
    }
}