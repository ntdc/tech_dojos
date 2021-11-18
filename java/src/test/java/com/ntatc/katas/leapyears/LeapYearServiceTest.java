package com.ntatc.katas.leapyears;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

/**
 * Write a function that returns true or false depending on whether its input integer is a leap year or not.
 * A leap year is defined as one that is divisible by 4,
 * but is not otherwise divisible by 100 unless it is also divisible by 400.
 * <p>
 * For example 2001 is a typical common year and
 * 1996 is a typical leap year,
 * whereas 1900 is an atypical common year and
 * 2000 is an atypical leap year.
 */
public class LeapYearServiceTest {

    @Test
    @DisplayName("should return false when year is the typical common year 2001")
    void shouldReturnFalseWhenYearIs2001() {
        //Given
        int year = 2001;
        LeapYearService leapYearService = new LeapYearService();

        //When
        boolean result = leapYearService.isLeapYear(year);

        //Then
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("should return true when year is the typical leap year 1996")
    void shouldReturnTrueWhenYearIs1996() {
        //Given
        int year = 1996;
        LeapYearService leapYearService = new LeapYearService();

        //When
        boolean result = leapYearService.isLeapYear(year);

        //Then
        assertThat(result).isTrue();
    }

}
