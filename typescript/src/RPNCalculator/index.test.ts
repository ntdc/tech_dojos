"use strict";

import { RPNCalculator } from "./index";

describe("RPNCalculator", () => {
    it("Should return 1 when given 1", () => {
        //Given
        const rpnCalculator = new RPNCalculator();
        //When
        const result = rpnCalculator.calculate("1");
        //Then
        expect(result).toEqual(1);
    });

    it("Should return 3 when given 3", () => {
        //Given
        const rpnCalculator = new RPNCalculator();
        //When
        const result = rpnCalculator.calculate("3");
        //Then
        expect(result).toEqual(3);
    });

    it("Should return 3 when given 1 2 +", () => {
        //Given
        const rpnCalculator = new RPNCalculator();
        //When
        const result = rpnCalculator.calculate("1 2 +");
        //Then
        expect(result).toEqual(3);
    });

    it("Should return 2 when given 5 3 -", () => {
        //Given
        const rpnCalculator = new RPNCalculator();
        //When
        const result = rpnCalculator.calculate("5 3 -");
        //Then
        expect(result).toEqual(2);
    });

    it("Should return 15 when given 5 3 *", () => {
        //Given
        const rpnCalculator = new RPNCalculator();
        //When
        const result = rpnCalculator.calculate("5 3 *");
        //Then
        expect(result).toEqual(15);
    });

    it("Should return 4 when given 20 5 /", () => {
        //Given
        const rpnCalculator = new RPNCalculator();
        //When
        const result = rpnCalculator.calculate("20 5 /");
        //Then
        expect(result).toEqual(4);
    });

    it("Should return 3 when given 4 2 + 3 -", () => {
        //Given
        const rpnCalculator = new RPNCalculator();
        //When
        const result = rpnCalculator.calculate("4 2 + 3 -");
        //Then
        expect(result).toEqual(3);
    });
    it("Should return 141 when given 3 5 8 * 7 + *", () => {
        //Given
        const rpnCalculator = new RPNCalculator();
        //When
        const result = rpnCalculator.calculate("3 5 8 * 7 + *");
        //Then
        expect(result).toEqual(141);
    });
    it("Should return 3 when given 9 SQRT", () => {
        //Given
        const rpnCalculator = new RPNCalculator();
        //When
        const result = rpnCalculator.calculate("9 SQRT");
        //Then
        expect(result).toEqual(3);
    });
});