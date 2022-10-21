package com.ntatc.katas.cupcake;

import java.math.BigDecimal;

public class Cookie implements Cake {

  @Override
  public String name() {
    return "Cookie";
  }

  @Override
  public BigDecimal price() {
    return new BigDecimal("2.0");
  }
}
