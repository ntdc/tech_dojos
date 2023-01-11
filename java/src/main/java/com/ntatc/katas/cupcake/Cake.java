package com.ntatc.katas.cupcake;

import java.math.BigDecimal;

public interface Cake {
  String getNom();

  default BigDecimal getPrix() {
    return new BigDecimal("0.0");
  }
}
