package com.ntatc.katas.rpn;

import com.ntatc.katas.leapyears.rpn.RPNCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RPNCalculatorTest {


    @Test
    @DisplayName("Should return 42 when input is 42")
    public void shouldReturn42WhenInputIs42() {
        //Given
        var calculator = new RPNCalculator();
        String expression = "42";

        //When
        int actual = calculator.calculate(expression);

        //Then
        assertThat(actual).isEqualTo(42);
    }

    @Test
    @DisplayName("Should return 5 when input is 3 2 +")
    public void shouldReturn5WhenInputIs3_2_Add() {
        //Given
        var calculator = new RPNCalculator();
        String expression = "3 2 +";

        //When
        int actual = calculator.calculate(expression);

        //Then
        assertThat(actual).isEqualTo(5);
    }

    @Test
    @DisplayName("Should return 4 when input is 7 3 -")
    public void shouldReturn4WhenInputIs7_3_Substract() {
        //Given
        var calculator = new RPNCalculator();
        String expression = "7 3 -";

        //When
        int actual = calculator.calculate(expression);

        //Then
        assertThat(actual).isEqualTo(4);
    }

    @Test
    @DisplayName("Should return 10 when input is 2 5 *")
    public void shouldReturn10WhenInputIs2_5_Multiply() {
        //Given
        var calculator = new RPNCalculator();
        String expression = "2 5 *";

        //When
        int actual = calculator.calculate(expression);

        //Then
        assertThat(actual).isEqualTo(10);
    }

    @Test
    @DisplayName("Should return 10 when input is 50 5 /")
    public void shouldReturn10WhenInputIs50_10_divide() {
        //Given
        var calculator = new RPNCalculator();
        String expression = "50 5 /";

        //When
        int actual = calculator.calculate(expression);

        //Then
        assertThat(actual).isEqualTo(10);
    }


}
