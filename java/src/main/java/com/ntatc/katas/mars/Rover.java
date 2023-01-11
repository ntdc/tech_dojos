package com.ntatc.katas.mars;


public class Rover implements ModuleMartien2D {

    private Direction direction;

    protected Position position;

    private boolean pretPourRecuperation = false;

    public Rover(Direction direction, Position position) {
        this.direction = direction;
        this.position = position;
    }

    // Open Close OK - Avec le pattern strategy implémenté à travers l'ENUM Direction,
    // plus besoin de modifier cette classe pour ajouter une direction

    public void avancer() {
        position = direction.getMouvement2D().avancer(position);
    }

    public void reculer() {
        position = direction.getMouvement2D().reculer(position);
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