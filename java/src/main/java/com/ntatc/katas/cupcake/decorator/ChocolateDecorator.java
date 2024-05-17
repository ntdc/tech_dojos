package com.ntatc.katas.cupcake.decorator;

import com.ntatc.katas.cupcake.Cake;
import com.ntatc.katas.cupcake.Price;

import java.math.BigDecimal;
import java.util.Optional;

public class ChocolateDecorator implements Cake {

  public ChocolateDecorator(Cake cake) {
    this.cake = cake;
  }

  private final Cake cake;

  public String name() {
    return cake.name() + " with chocolate";
  }

  @Override
  public BigDecimal price() {
    return cake.price().add(new BigDecimal("0.1"));
  }
}
