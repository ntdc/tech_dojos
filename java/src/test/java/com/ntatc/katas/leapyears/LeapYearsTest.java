package com.ntatc.katas.leapyears;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class LeapYearsTest {

	@Test
	void shouldReturnFalseWhenReturnTypicalCommonYearsIs2001() {
		
		// Given
		int year = 2001;
		LeapYear leapYears = new LeapYear();
		
		// When 
		boolean response = leapYears.isLeapYears(year);
		
		// Then
		assertFalse(response);
		
	}
}
