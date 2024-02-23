package com.ntatc.katas.mars;

public class Rover implements ModuleMartien2D {

    private Direction direction;

    protected Position position;

    private boolean pretPourRecuperation = false;

    public Rover(Direction direction, Position position) {
        this.direction = direction;
        this.position = position;
    }

    public void avancer() {
        position = direction.getMouvement2D().avancer(this.position);
    }

    public void reculer() {
        position = direction.getMouvement2D().reculer(this.position);
    }

    public void activerRecuperation() {
        pretPourRecuperation = true;
        System.out.println("on est prêt");
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