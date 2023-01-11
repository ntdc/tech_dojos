package com.ntatc.katas.cupcake;

import java.math.BigDecimal;

public class Nuts implements Cake {

  private Cake cake;

  public Nuts(Cake cake) {
    this.cake = cake;
  }

  @Override
  public String getNom() {
    return cake.getNom() + " with nuts";
  }

  @Override
  public BigDecimal getPrix() {
    return cake.getPrix().add(new BigDecimal("0.2"));
  }
}
