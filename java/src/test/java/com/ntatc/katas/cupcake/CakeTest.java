package com.ntatc.katas.cupcake;

import com.ntatc.katas.cupcake.decorator.ChocolateDecorator;
import com.ntatc.katas.cupcake.decorator.NutsDecorator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CakeTest {
  @Test
  void shouldReturnCupcakeName() {
    // GIVEN
    var cupcake = new Cupcake();

    // WHEN
    var name = cupcake.name();

    // THEN
    Assertions.assertEquals("Cupcake", name);
  }

  @Test
  void shouldReturnCookieName() {
    // GIVEN
    var cookie = new Cookie();

    // WHEN
    var name = cookie.name();

    // THEN
    Assertions.assertEquals("Cookie", name);
  }

  @Test
  void shouldReturnCupcakeWithChocolate() {
    // GIVEN
    var cake = new ChocolateDecorator(new Cupcake());

    // WHEN
    var name = cake.name();

    // THEN
    Assertions.assertEquals("Cupcake with chocolate", name);
  }

  @Test
  void shouldReturnCookieWithChocolate() {
    // GIVEN
    var cake = new ChocolateDecorator(new Cookie());

    // WHEN
    var name = cake.name();

    // THEN
    Assertions.assertEquals("Cookie with chocolate", name);
  }

  @Test
  void shouldReturnCookieWithChocolateAndNuts() {
    // GIVEN
    var cake = new NutsDecorator(new ChocolateDecorator(new Cookie()));

    // WHEN
    var name = cake.name();

    // THEN
    Assertions.assertEquals("Cookie with chocolate with nuts", name);
  }

  @Test
  void shouldReturnCookieWithNutsAndChocolate() {
    // GIVEN
    var cake = new ChocolateDecorator(new NutsDecorator(new Cookie()));

    // WHEN
    var name = cake.name();

    // THEN
    Assertions.assertEquals("Cookie with nuts with chocolate", name);
  }
}
