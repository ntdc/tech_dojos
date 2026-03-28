package com.ntatc.katas.cupcake;

public interface Cake {

    String getName();

    default float getPrice() {
        return 0;
    }

}
