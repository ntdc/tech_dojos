package com.ntatc.katas.mars;

public class MouvementSud2D implements Mouvement2D {

    public Position avancer(Position position) {
        return new Position(position.getX(), position.getY() - 1, position.getZ());
    }

    public Position reculer(Position position) {
        return new Position(position.getX(), position.getY() + 1, position.getZ());
    }
}
