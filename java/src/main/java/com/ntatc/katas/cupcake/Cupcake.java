package com.ntatc.katas.cupcake;

import java.math.BigDecimal;

public class Cupcake implements Cake {

  public String getNom() {
    return "cupcake";
  }

  public BigDecimal getPrix() {
    return new BigDecimal("1.0");
  }
}
