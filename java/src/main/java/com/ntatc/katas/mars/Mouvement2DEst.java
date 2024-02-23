package com.ntatc.katas.mars;

public class Mouvement2DEst implements Mouvement2D{
    @Override
    public Position avancer(Position position) {
        return new Position(position.getX() + 1, position.getY(), position.getZ());
    }

    @Override
    public Position reculer(Position position) {
        return new Position(position.getX() - 1, position.getY(), position.getZ());
    }
}