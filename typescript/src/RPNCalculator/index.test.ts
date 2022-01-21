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
    })
    it("Should return 3 when given 3", () => {
        //Given
        const rpnCalculator = new RPNCalculator();
        //When
        const result = rpnCalculator.calculate("3");
        //Then
        expect(result).toEqual(3);
    })
});