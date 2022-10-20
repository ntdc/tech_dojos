package com.ntatc.katas.cupcake.decorator;

import com.ntatc.katas.cupcake.Cake;

public class NutsDecorator implements Cake {
  private final Cake cake;

  public NutsDecorator(Cake cake) {
    this.cake = cake;
  }

  @Override
  public String name() {
    return cake.name() + " with nuts";
  }
}
