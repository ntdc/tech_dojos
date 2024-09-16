package com.ntatc.katas.cupcake;

public class Chocolate extends CakeDecorator {

    public Chocolate(Cake cake) {
        super(cake);
    }

    @Override
    public String getTopping() {
        return "🍫";
    }

    @Override
    public float getToppingPrice() {
        return 0.1f;
    }

}
