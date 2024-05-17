package com.ntatc.katas.cupcake;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CakeBundle implements Cake {

    List<Cake> cakes = new ArrayList<>();

    public void add(Cake cake) {
        cakes.add(cake);
    }

    @Override
    public String name() {
        return "";
    }

    @Override
    public BigDecimal price() {
        return cakes.stream()
                .map(Cake::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .multiply(new BigDecimal("0.9"));
    }
}
