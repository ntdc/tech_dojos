package com.ntatc.katas.cupcake;

public class Sugar extends CakeDecorator {

    public Sugar(Cake cake) {
        super(cake);
    }

    @Override
    public String getTopping() {
        return "🍬";
    }

    @Override
    public float getToppingPrice() {
        return 0.3f;
    }

}
