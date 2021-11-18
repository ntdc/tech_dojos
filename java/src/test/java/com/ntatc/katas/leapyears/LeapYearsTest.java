package com.ntatc.katas.leapyears;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
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
		Assertions.assertFalse(response);
		
	}

	@Test
	void shouldReturnTrueWhenTypicalLeapYearsIs1996() {

		// Given
		int year = 1996;
		LeapYear leapYears = new LeapYear();

		// When
		boolean response = leapYears.isLeapYears(year);

		// Then
		assertTrue(response);

	}
	
	@Test
	void shouldReturnTrueWhenTypicalLeapYearsIs1992() {

		// Given
		int year = 1992;
		LeapYear leapYears = new LeapYear();

		// When
		boolean response = leapYears.isLeapYears(year);

		// Then
		assertTrue(response);

	}

	@Test
	void shouldReturnFalseWhenAtypicalCommonYearIs1900() {

		// Given
		int year = 1900;
		LeapYear leapYears = new LeapYear();

		// When
		boolean response = leapYears.isLeapYears(year);

		// Then
		Assertions.assertFalse(response);
	}
}
