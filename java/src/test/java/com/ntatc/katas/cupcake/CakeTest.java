package com.ntatc.katas.cupcake;

import com.ntatc.katas.cupcake.decorator.ChocolateDecorator;
import com.ntatc.katas.cupcake.decorator.NutsDecorator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CakeTest {
  @Test
  void shouldReturnCupcakeName() {
    // GIVEN
    var cupcake = new Cupcake();

    // WHEN
    var name = cupcake.name();

    // THEN
    assertEquals("Cupcake", name);
  }

  @Test
  void shouldReturnCookieName() {
    // GIVEN
    var cookie = new Cookie();

    // WHEN
    var name = cookie.name();

    // THEN
    assertEquals("Cookie", name);
  }

  @Test
  void shouldReturnCupcakeWithChocolate() {
    // GIVEN
    var cake = new ChocolateDecorator(new Cupcake());

    // WHEN
    var name = cake.name();

    // THEN
    assertEquals("Cupcake with chocolate", name);
  }

  @Test
  void shouldReturnCookieWithChocolate() {
    // GIVEN
    var cake = new ChocolateDecorator(new Cookie());

    // WHEN
    var name = cake.name();

    // THEN
    assertEquals("Cookie with chocolate", name);
  }

  @Test
  void shouldReturnCookieWithChocolateAndNuts() {
    // GIVEN
    var cake = new NutsDecorator(new ChocolateDecorator(new Cookie()));

    // WHEN
    var name = cake.name();

    // THEN
    assertEquals("Cookie with chocolate with nuts", name);
  }

  @Test
  void shouldReturnCookieWithNutsAndChocolate() {
    // GIVEN
    var cake = new ChocolateDecorator(new NutsDecorator(new Cookie()));

    // WHEN
    var name = cake.name();

    // THEN
    assertEquals("Cookie with nuts with chocolate", name);
  }

  @Test
  void shouldReturnCupcakePrice() {
    // GIVEN
    var cupcake = new Cupcake();

    // WHEN
    var price = cupcake.price();

    // THEN
    assertEquals(BigDecimal.valueOf(1.0), price);
  }

  @Test
  void shouldReturnCookiePrice() {
    // GIVEN
    var cookie = new Cookie();

    // WHEN
    var price = cookie.price();

    // THEN
    assertEquals(BigDecimal.valueOf(2.0), price);
  }

  @Test
  void shouldReturnCupcakeWithChocolatePrice() {
    // GIVEN
    var cake = new ChocolateDecorator(new Cupcake());

    // WHEN
    var price = cake.price();

    // THEN
    assertEquals(BigDecimal.valueOf(1.1), price);
  }

  @Test
  void shouldReturnCookieWithChocolatePrice() {
    // GIVEN
    var cake = new ChocolateDecorator(new Cookie());

    // WHEN
    var price = cake.price();

    // THEN
    assertEquals(BigDecimal.valueOf(2.1), price);
  }

  @Test
  void shouldReturnCookieWithNutsPrice() {
    // GIVEN
    var cake = new NutsDecorator(new Cookie());

    // WHEN
    var price = cake.price();

    // THEN
    assertEquals(BigDecimal.valueOf(2.2), price);
  }

}
