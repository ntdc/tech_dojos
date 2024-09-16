package com.ntatc.katas.cupcake;

import java.util.List;

public class Bundle {

    private List<Cake> cakes;

    public Bundle(Cake... cake) {
        cakes = List.of(cake);
    }

    public float getPrice() {
        float result = 0;
        for (Cake item : cakes) {
           result += item.getPrice();
        }
        return result * 0.9f;
    }

}
