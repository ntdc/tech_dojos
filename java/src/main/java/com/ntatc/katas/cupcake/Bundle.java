package com.ntatc.katas.cupcake;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bundle implements Cake {

  private List<Cake> cakeList;

  public Bundle() {
    this.cakeList = new ArrayList<>();
  }

  @Override
  public String getNom() {
    return null;
  }

  @Override
  public BigDecimal getPrix() {
    return this.cakeList.stream()
        .map(Cake::getPrix)
        .reduce(new BigDecimal("0.0"), BigDecimal::add)
        .multiply(new BigDecimal("0.9"));
  }

  public void addCake(Cake cake) {
    this.cakeList.add(cake);
  }
}
