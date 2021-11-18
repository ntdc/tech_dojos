package com.ntatc.katas.leapyears;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

  // 2001 n'est pas ann�e bissextile
  @Test
  void checkIf2001IsTypicalCommonYear() {
    // GIVEN
    int year = 2001;
    // WHEN
    boolean isLeapYear = LeapYears.isLeapYear(year);
    // THEN
    assertFalse(isLeapYear);
  }

  @Test
  @DisplayName("Verifier que 1996 est bien une année bissextile")
  void shouldCheckIf1996IsTypicalLeapYear() {
    // GIVEN
    int year = 1996;
    // WHEN
    boolean leapYear = LeapYears.isLeapYear(year);
    // THEN
    assertTrue(leapYear);
  }

  @Test
  @DisplayName("Verifier que 2004 est bien une année bissextile")
  void shouldCheckIf2004IsTypicalLeapYear() {
    // GIVEN
    int year = 2004;
    // WHEN
    boolean leapYear = LeapYears.isLeapYear(year);
    // THEN
    assertTrue(leapYear);
  }
}
