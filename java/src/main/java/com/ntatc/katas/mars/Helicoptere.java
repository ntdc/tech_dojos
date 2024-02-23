package com.ntatc.katas.mars;

import java.util.stream.IntStream;

public class Helicoptere extends Rover implements ModuleMartien3D {

    public Helicoptere(Direction direction, Position position) {
        super(direction, position);
    }

    @Override
    public void monter() {
        position = new Position(position.getX(), position.getY(), position.getZ() + 1);
    }

    @Override
    public void descendre() {
        position = new Position(position.getX(), position.getY(), position.getZ() - 1);
    }

    @Override
    public void activerRecuperation() {
        this.poserHelicoptere();
        super.activerRecuperation();
    }

    public void poserHelicoptere() {
        int altitude = this.getPosition().getZ();
        atterir(altitude);
    }

    public void atterir(int altitude) {
        IntStream.range(0, altitude)
                .forEach((i -> this.descendre()));
    }
}