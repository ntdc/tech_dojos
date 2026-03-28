package com.ntatc.katas.cupcake;

public abstract class CakeDecorator implements Cake {

    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    public abstract String getTopping();
    public abstract float getToppingPrice();

    @Override
    public String getName() {
        return cake.getName().contains("with")
                ? cake.getName() + " and " + this.getTopping()
                : cake.getName() + " with " + this.getTopping();
    }

    @Override
    public float getPrice() {
        return cake.getPrice() + this.getToppingPrice();
    }
}
