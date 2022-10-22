package com.ntatc.katas.cupcake.decorator;

import com.ntatc.katas.cupcake.Cake;
import com.ntatc.katas.cupcake.Price;

import java.math.BigDecimal;
import java.util.Optional;

public class NutsDecorator implements Cake {
  private final Cake cake;

  public NutsDecorator(Cake cake) {
    this.cake = cake;
  }

  @Override
  public String name() {
    return cake.name() + " with nuts";
  }

  @Override
  public BigDecimal price() {
    return cake.price().add(new BigDecimal("0.2"));
  }
}
