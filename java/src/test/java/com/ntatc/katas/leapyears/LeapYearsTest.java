package com.ntatc.katas.leapyears;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
/*
Write a function that returns true or false depending on whether its input integer is a leap year or not.
 A leap year is defined as one that is divisible by 4, but is not otherwise divisible by 100 unless it is also divisible by 400.

For example 2001 is a typical common year and 1996 is a typical leap year, whereas 1900 is an atypical common year and 2000
is an atypical leap year.
 */
public class LeapYearsTest {

    @Test
    void test1996IsLeapYear(){
        //Given
        int annee = 1996;
        //When
        var isLeapYears = LeapYears.isLeapYears(annee);
        //Then
        Assertions.assertThat(isLeapYears).isTrue();
    }

    @Test
    void test1992IsLeapYear(){
        //Given
        int annee = 1992;
        //When
        var isLeapYears = LeapYears.isLeapYears(annee);
        //Then
        Assertions.assertThat(isLeapYears).isTrue();
    }

    @Test
    void test1900IsNotLeapYear(){
        //Given
        int annee = 1900;
        //When
        var isLeapYears = LeapYears.isLeapYears(annee);
        //Then
        Assertions.assertThat(isLeapYears).isFalse();
    }

}
