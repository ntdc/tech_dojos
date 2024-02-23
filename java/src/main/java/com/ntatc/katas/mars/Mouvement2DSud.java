package com.ntatc.katas.mars;

public class Mouvement2DSud implements Mouvement2D{
    @Override
    public Position avancer(Position position) {
        return new Position(position.getX(), position.getY() - 1, position.getZ());
    }

    @Override
    public Position reculer(Position position) {
        return new Position(position.getX(), position.getY()  + 1, position.getZ());
    }
}
