package com.ntatc.katas.leapyears.rpn;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class RPNCalculator {

    private static final String SPACE = " ";

    public int calculate(String expression) {
        String[] expressions = expression.split(SPACE);
        if (isAnOperation(expressions)) {
            int leftOperand = extractLeftOperand(expressions);
            int rightOperand = extractRightOperand(expressions);
            String symbol = extractSymbol(expressions);

            Operation operation = Operation.of(symbol);
            return operation.calculate(leftOperand, rightOperand);
        }

        return Integer.parseInt(expression);
    }

    private String extractSymbol(String[] expressions) {
        return expressions[2];
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

    private enum Operation {
        ADD("+", (a,b) -> a+b),
        SUB("-",(a,b) -> a-b),
        MULTIPLY("*",(a,b) -> a*b);

        private final String symbol;
        private final BinaryOperator<Integer> calculate;

        Operation(String symbol, BinaryOperator<Integer> calculate) {
            this.symbol = symbol;
            this.calculate = calculate;
        }

        public static Operation of(String symbol) {
            return Arrays.stream(values()).filter(operation -> operation.symbol.equals(symbol))
                    .findFirst()
                    .orElseThrow();
        }

        public int calculate(int leftOperand, int rightOperand) {
            return this.calculate.apply(leftOperand, rightOperand);
        }
    }
}