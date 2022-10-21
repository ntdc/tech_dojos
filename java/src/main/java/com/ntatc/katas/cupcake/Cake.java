package com.ntatc.katas.cupcake;

import java.math.BigDecimal;

public interface Cake {
    String name();
    default BigDecimal price() {
        return new BigDecimal("0.0");
    }
}
