package com.ntatc.katas.leapyears;

public class LeapYear {

	public boolean isLeapYears(int year) {

		return isTypicalLeapYears(year) && year != 1900;
	}

	private boolean isTypicalLeapYears(int year) {
		return year%4 == 0;
	}

	
}
