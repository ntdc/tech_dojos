package com.ntatc.katas.mars;

public class Helicoptere extends Rover implements ModuleMartien {

    // TODO : "extends Rover" - Pas de soucis ici, un hélicoptère peut récupérer le comportement d'un rover, ca reste un hélicoptère

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
}