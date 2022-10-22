package com.ntatc.katas.cupcake;

public class Nuts extends CakeDecorator {

    public Nuts(Cake cake) {
        super(cake);
    }

    @Override
    public String getTopping() {
        return "🥜";
    }

    @Override
    public float getToppingPrice() {
        return 0.2f;
    }

}
