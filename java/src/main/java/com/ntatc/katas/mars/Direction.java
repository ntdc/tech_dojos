package com.ntatc.katas.mars;

import java.util.function.Function;

public enum Direction {

    NORD((position) -> new Position(position.getX(), position.getY() + 1, position.getZ()),
            (position) -> new Position(position.getX(), position.getY() - 1, position.getZ())),

    SUD((position) -> new Position(position.getX(), position.getY() - 1, position.getZ()),
            (position) -> new Position(position.getX(), position.getY() + 1, position.getZ())),

    OUEST((position) -> new Position(position.getX() - 1, position.getY(), position.getZ()),
            (position) -> new Position(position.getX() + 1, position.getY(), position.getZ())),

    EST((position) -> new Position(position.getX() + 1, position.getY(), position.getZ()),
            (position) -> new Position(position.getX() - 1, position.getY(), position.getZ()));

    private final Function<Position, Position> avancer;
    private final Function<Position, Position> reculer;

    Direction(Function<Position, Position> avancer, Function<Position, Position> reculer) {
        this.avancer = avancer;
        this.reculer = reculer;
    }

    public Function<Position, Position> avancer() {
        return this.avancer;
    }

    public Function<Position, Position> reculer() {
        return this.reculer;
    }
}