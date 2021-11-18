package com.ntatc.katas.leapyears;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
	
	//2001 n'est pas année bissextile
	@Test
	void checkIfYearisLeap(){
		//GIVEN
		int year=2001;
		//WHEN
		boolean isLeapYear=LeapYears.isLeapYear(year);
		//THEN
		Assertions.assertFalse(isLeapYear);
		
	}

}
