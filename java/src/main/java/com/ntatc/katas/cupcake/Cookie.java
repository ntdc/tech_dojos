package com.ntatc.katas.cupcake;

public class Cookie implements Cake {

    @Override
    public String getName() {
        return "🍪";
    }

    @Override
    public float getPrice(){
        return 2.0f;
    }

}
