package com.ntatc.katas.cupcake;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CupcakeTest {

  @Test
  void doit_retourner_un_cupcake() {
    // given
    Cake cupcake = new Cupcake();
    // when
    String nom = cupcake.getNom();
    // then
    Assertions.assertEquals("cupcake", nom);
  }

  @Test
  void doit_retourner_un_cookie() {
    // given
    Cake cookie = new Cookie();
    // when
    String nom = cookie.getNom();
    // then
    Assertions.assertEquals("cookie", nom);
  }

  @Test
  void doit_retourner_un_cupcake_avec_chocolat() {
    // given
    Cake cupcakeWithChocolate = new Chocolate(new Cupcake());
    // when
    String nom = cupcakeWithChocolate.getNom();
    // then
    Assertions.assertEquals("cupcake with chocolate", nom);
  }

  @Test
  void doit_retourner_un_cookie_avec_chocolat() {
    // given
    Cake cookieWithChocolate = new Chocolate(new Cookie());
    // when
    String nom = cookieWithChocolate.getNom();
    // then
    Assertions.assertEquals("cookie with chocolate", nom);
  }

  @Test
  void doit_retourner_un_cookie_avec_chocolat_et_cacahuettes() {
    // given
    Cake cookieWithChocolateAndNuts = new Nuts(new Chocolate(new Cookie()));
    // when
    String nom = cookieWithChocolateAndNuts.getNom();
    // then
    Assertions.assertEquals("cookie with chocolate with nuts", nom);
  }

  @Test
  void doit_retourner_un_cookie_avec_cacahuettes_et_chocolat() {
    // given
    Cake cookieWithChocolateAndNuts = new Chocolate(new Nuts(new Cookie()));
    // when
    String nom = cookieWithChocolateAndNuts.getNom();
    // then
    Assertions.assertEquals("cookie with nuts with chocolate", nom);
  }

  @Test
  void doit_retourner_un_cupcake_a_1_dollard() {
    // given
    Cake cupcake = new Cupcake();
    // when
    BigDecimal prix = cupcake.getPrix();
    // then
    Assertions.assertEquals(new BigDecimal("1.0"), prix);
  }

  @Test
  void doit_retourner_un_cookie_a_2_dollard() {
    // given
    Cake cupcake = new Cookie();
    // when
    BigDecimal prix = cupcake.getPrix();
    // then
    Assertions.assertEquals(new BigDecimal("2.0"), prix);
  }

  @Test
  void doit_retourner_un_cupcake_avec_chocolate_a_1_1_dollard() {
    // given
    Cake cupcakeWithChocolate = new Chocolate(new Cupcake());
    // when
    BigDecimal prix = cupcakeWithChocolate.getPrix();
    // then
    Assertions.assertEquals(new BigDecimal("1.1"), prix);
  }

  @Test
  void doit_retourner_un_cookie_avec_chocolate_a_2_1_dollard() {
    // given
    Cake cookieWithChocolate = new Chocolate(new Cookie());
    // when
    BigDecimal prix = cookieWithChocolate.getPrix();
    // then
    Assertions.assertEquals(new BigDecimal("2.1"), prix);
  }

  @Test
  void doit_retourner_un_cookie_avec_chocolate_et_nuts_a_2_3_dollard() {
    // given
    Cake cookieWithChocolateAndNuts = new Nuts(new Chocolate(new Cookie()));
    // when
    BigDecimal prix = cookieWithChocolateAndNuts.getPrix();
    // then
    Assertions.assertEquals(new BigDecimal("2.3"), prix);
  }

  @Test
  void doit_retourner_un_cookie_avec_nuts_et_chocolate_a_2_3_dollard() {
    // given
    Cake cookieWithNutsAndChocolate = new Chocolate(new Nuts(new Cookie()));
    // when
    BigDecimal prix = cookieWithNutsAndChocolate.getPrix();
    // then
    Assertions.assertEquals(new BigDecimal("2.3"), prix);
  }

  @Test
  void doit_retourner_le_prix_pour_1_bundle_contenant_1_cupcake() {
    // given
    Bundle bundleWithOneCupcake = new Bundle();
    bundleWithOneCupcake.addCake(new Cupcake());
    // when
    BigDecimal prix = bundleWithOneCupcake.getPrix();
    // then
    Assertions.assertEquals(new BigDecimal("0.90"), prix);
  }
}
