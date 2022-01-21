package com.ntatc.katas.rpn;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RpnCalculatorTest {
	@Test
	@DisplayName("Test que lorsqu'on envoie 1, on récupère 1")
	void should_compute_1_for_input_1(){
		// Given.
		String input = "1";
		
		// When.
		RpnCalculator rpnCalculator = new RpnCalculator();
		int result = rpnCalculator.compute(input);
		
		// Then.
		Assertions.assertThat(result).isEqualTo(1);
	}
}