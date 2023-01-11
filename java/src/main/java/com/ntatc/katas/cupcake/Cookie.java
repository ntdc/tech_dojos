package com.ntatc.katas.cupcake;

import java.math.BigDecimal;

public class Cookie implements Cake {

  public String getNom() {
    return "cookie";
  }

  public BigDecimal getPrix() {
    return new BigDecimal("2.0");
  }
}
