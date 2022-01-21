package com.ntatc.katas.rpn;

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

    private class RPNCalculator {

        private static final String SPACE = " ";

        public int calculate(String expression) {
            String[] expressions = expression.split(SPACE);

            if (isAnOperation(expressions)) {
                int leftOperand = extractLeftOperand(expressions);
                int rightOperand = extractRightOperand(expressions);

                if (isAnAddition(expressions)) {
                    return leftOperand + rightOperand;
                } else if (isASubstraction(expressions)) {
                    return leftOperand - rightOperand;
                } else {
                    return leftOperand * rightOperand;
                }
            }

            return Integer.parseInt(expression);
        }

        private boolean isAnAddition(String[] expressions) {
            return expressions[2].equals("+");
        }

        private boolean isASubstraction(String[] expressions) {
            return expressions[2].equals("-");
        }

        private boolean isAnOperation(String[] expressions) {
            return expressions.length > 1;
        }

        private int extractRightOperand(String[] expressions) {
            return Integer.parseInt(expressions[1]);
        }

        private int extractLeftOperand(String[] expressions) {
            return Integer.parseInt(expressions[0]);
        }

    }
}
