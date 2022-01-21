package com.ntatc.katas.rpn;

public class RpnCalculator {

	public int compute(String input) {
		String [] splitInput = input.split(" ");
		if(splitInput.length > 1) {
			int leftOperand = Integer.parseInt(splitInput[0]);
			int rightOperand = Integer.parseInt(splitInput[1]);
			return leftOperand+rightOperand;
		} else {
			return Integer.parseInt(input);
		}
	}

}
