package com.ntatc.katas.mars;

public class Position {
    private int x;

    private int y;

    private int z;

    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Position)) {
            return false;
        } else {
            Position other = (Position) o;
            if (this.getX() != other.getX()) {
                return false;
            } else if (this.getY() != other.getY()) {
                return false;
            } else {
                return this.getZ() == other.getZ();
            }
        }
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        result = result * 59 + this.getZ();
        return result;
    }
}