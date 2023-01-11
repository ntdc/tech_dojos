package com.ntatc.katas.mars;

public class Rover implements ModuleMartien {

    private Direction direction;

    protected Position position;

    private boolean pretPourRecuperation = false;

    public Rover(Direction direction, Position position) {
        this.direction = direction;
        this.position = position;
    }

    // FIXME : Open Close - Obliger de modifier la classe si on veut ajouter une direction
    //  Le switch peut nous aider à identifier rapidemment cette violation
    public void avancer() {
        switch (direction) {
            case NORD:
                position = new Position(position.getX(), position.getY() + 1, position.getZ());
                break;
            case SUD:
                position = new Position(position.getX(), position.getY() - 1, position.getZ());
                break;
            case OUEST:
                position = new Position(position.getX() - 1, position.getY(), position.getZ());
                break;
            default:
                position = new Position(position.getX() + 1, position.getY(), position.getZ());
        }
    }

    public void reculer() {
        switch (direction) {
            case NORD:
                position = new Position(position.getX(), position.getY() - 1, position.getZ());
                break;
            case SUD:
                position = new Position(position.getX(), position.getY() + 1, position.getZ());
                break;
            case OUEST:
                position = new Position(position.getX() + 1, position.getY(), position.getZ());
                break;
            default:
                position = new Position(position.getX() - 1, position.getY(), position.getZ());
        }
    }

    @Override
    public void monter() {
        throw new UnsupportedOperationException("Un rover ne vole pas");
    } // FIXME : Conséquence de la violation Interface Segregation dans ModuleMartien


    @Override
    public void descendre() {
        throw new UnsupportedOperationException("Un rover ne vole pas");
    } // FIXME : Conséquence de la violation Interface Segregation dans ModuleMartien

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