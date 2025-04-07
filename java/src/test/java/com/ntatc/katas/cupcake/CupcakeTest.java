package com.ntatc.katas.cupcake;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class CupcakeTest {

    @Test
    public void testCakeReturnCupcakeName() {
        Cake cake = new Cupcake();
        Assertions.assertThat(cake.getName()).isEqualTo("🧁");
    }

    @Test
    public void testCookieReturnCookieName() {
        Cake cake = new Cookie();
        Assertions.assertThat(cake.getName()).isEqualTo("🍪");
    }

    @Test
    @DisplayName("Cupcake with chocolate must return 🧁 with 🍫")
    public void testCupcakeWithChocolateReturnName() {
        Cake cake = new Chocolate(new Cupcake());
        Assertions.assertThat(cake.getName()).isEqualTo("🧁 with 🍫");
    }

    @Test
    @DisplayName("Cookie with chocolate must return 🍪 with 🍫")
    public void testCookieWithChocolateReturnName() {
        Cake cake = new Chocolate(new Cookie());
        Assertions.assertThat(cake.getName()).isEqualTo("🍪 with 🍫");
    }


    @Test
    @DisplayName("Cookie with nuts must return 🍪 with 🥜")
    public void testCookieWithNutsReturnName() {
        Cake cake = new Nuts(new Cookie());
        Assertions.assertThat(cake.getName()).isEqualTo("🍪 with 🥜");
    }

    @Test
    @DisplayName("Cookie with nuts and chocolate must return 🍪 with 🥜 and 🍫")
    public void testCookieWithNutsAndChocolateReturnName() {
        Cake cake = new Chocolate(new Nuts(new Cookie()));
        Assertions.assertThat(cake.getName()).isEqualTo("🍪 with 🥜 and 🍫");
    }

    @Test
    @DisplayName("Cupcake with sugar and chocolate and nuts must return 🧁 with 🍬 and 🍫 and 🥜 and 🍫")
    public void testComplexCupcakeReturnName() {
        Cake cake = new Chocolate(new Nuts(new Chocolate(new Sugar(new Cupcake()))));
        Assertions.assertThat(cake.getName()).isEqualTo("🧁 with 🍬 and 🍫 and 🥜 and 🍫");
    }

    @Test
    public void testCupcakeReturnCupcakePrice() {
        Cake cake = new Cupcake();
        Assertions.assertThat(cake.getPrice()).isEqualTo(1);
    }

    @Test
    public void testCookieReturnCookiePrice() {
        Cake cake = new Cookie();
        Assertions.assertThat(cake.getPrice()).isEqualTo(2);
    }

    @Test
    public void testCookieWithChocolateReturnPrice() {
        Cake cake = new Chocolate(new Cookie());
        Assertions.assertThat(cake.getPrice()).isEqualTo(2.1f);
    }

    @Test
    public void testComplexCookieReturnPrice() {
        Cake cake = new Sugar(new Nuts( new Chocolate(new Chocolate(new Cookie()))));
        Assertions.assertThat(cake.getPrice()).isCloseTo(2.7f, Offset.offset(0.01f));
    }

    @Test
    public void testBundleOfACupcakeAndCheckThePrice() {
        Bundle bundle = new Bundle(new Cupcake());
        Assertions.assertThat(bundle.getPrice()).isCloseTo(0.9f, Offset.offset(0.01f));
    }

    @Test
    public void testBundleOfACupcakeAndACookieAndCheckThePrice() {
        Bundle bundle = new Bundle(new Cupcake(), new Cookie());
        Assertions.assertThat(bundle.getPrice()).isCloseTo(2.7f, Offset.offset(0.01f));
    }

}
