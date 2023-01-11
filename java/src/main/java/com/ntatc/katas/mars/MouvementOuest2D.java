package com.ntatc.katas.mars;

public class MouvementOuest2D implements Mouvement2D {

    public Position avancer(Position position) {
        return new Position(position.getX() - 1, position.getY(), position.getZ());
    }

    public Position reculer(Position position) {
        return new Position(position.getX() + 1, position.getY(), position.getZ());
    }
}
