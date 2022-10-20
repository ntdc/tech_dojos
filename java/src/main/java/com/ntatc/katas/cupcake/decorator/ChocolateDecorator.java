package com.ntatc.katas.cupcake.decorator;

import com.ntatc.katas.cupcake.Cake;

public class ChocolateDecorator implements Cake {

  public ChocolateDecorator(Cake cake) {
    this.cake = cake;
  }

  private final Cake cake;

  public String name() {
    return cake.name() + " with chocolate";
  }
}
