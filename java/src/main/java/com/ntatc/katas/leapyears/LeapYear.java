package com.ntatc.katas.leapyears;

public class LeapYear {

	public boolean isLeapYears(int year) {

		return isTypicalLeapYears(year) && !isAtypicalCommonYear(year);
	}

	private boolean isTypicalLeapYears(int year) {
		return year%4 == 0;
	}
	
	private boolean isAtypicalCommonYear(int year) {
		
		return (year%100 == 0);
	}

	
}
