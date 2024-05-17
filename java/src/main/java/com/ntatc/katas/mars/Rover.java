package com.ntatc.katas.mars;

public class Rover implements ModuleMartien2D {

    private final Direction direction;

    protected Position position;

    private boolean pretPourRecuperation = false;

    public Rover(Direction direction, Position position) {
        this.direction = direction;
        this.position = position;
    }

    public void avancer() {
        position = direction.avancer().apply(position);
    }

    public void reculer() {
        position = direction.reculer().apply(position);
    }

    public void activerRecuperation() {
        pretPourRecuperation = true;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public boolean isPretPourRecuperation() {
        return pretPourRecuperation;
    }
}