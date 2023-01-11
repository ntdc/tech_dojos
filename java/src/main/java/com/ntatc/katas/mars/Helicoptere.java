package com.ntatc.katas.mars;

import java.util.stream.IntStream;

public class Helicoptere extends Rover implements ModuleMartien3D {

    // Hélicoptère étend toujours Rover car ce n'était pas un problème
    // (un hélicoptère peut récupérer le comportement d'un rover, ca reste un hélicoptère)

    public Helicoptere(Direction direction, Position position) {
        super(direction, position);
    }

    @Override
    public void monter() {
        position = new Position(position.getX(), position.getY(), position.getZ() + 1);
    }

    @Override
    public void descendre() {
        position = new Position(position.getX(), position.getX(), position.getZ() - 1);
    }

    @Override
    public void activerRecuperation() {
        atterir();
        super.activerRecuperation();
    }

    private void atterir() {
        IntStream.range(0, getPosition().getZ())
                .forEach((i -> descendre()));
    }
}