package com.ntatc.katas.cupcake;

import java.math.BigDecimal;

public class Cupcake implements Cake {
  @Override
  public String name() {
    return "Cupcake";
  }

  @Override
  public BigDecimal price() {
    return new BigDecimal("1.0");
  }
}
