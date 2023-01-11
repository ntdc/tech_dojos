package com.ntatc.katas.cupcake;

import java.math.BigDecimal;

public class Chocolate implements Cake {

  private Cake cake;

  public Chocolate(Cake cake) {
    this.cake = cake;
  }

  @Override
  public String getNom() {
    return cake.getNom() + " with chocolate";
  }

  @Override
  public BigDecimal getPrix() {
    return cake.getPrix().add(new BigDecimal("0.1"));
  }
}
