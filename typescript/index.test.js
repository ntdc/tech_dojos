

// 2001 is a typical common year
// 1996 is a typical leap year
// 1992 is a typical leap year
// 1900 is an atypical common year
// 2000 is an atypical leap year
// 
// All years not divisible by 4 are NOT leap years
// All years divisible by 4 but not by 100 ARE leap years 
// All years divisible by 100 but not by 400 are NOT leap years 
// All years divisible by 400 ARE leap years

const isLeapYear = require("./index");

test("should return false when typical common year 2001", () => {
    
    // Given
    const annee = 2001;
    // When
    const leapYear = isLeapYear(annee)
    // Then
    expect(leapYear).toBe(false);
});


test("should return true when typical leap year 1996", () => {
    
    // Given
    const annee = 1996;
    // When
    const leapYear = isLeapYear(annee)
    // Then
    expect(leapYear).toBe(true);
});


test("should return true when typical leap year 1992", () => {
    
    // Given
    const annee = 1992;
    // When
    const leapYear = isLeapYear(annee)
    // Then
    expect(leapYear).toBe(true);
});

test("should return false when atypical common year 1990", () => {
    
    // Given
    const annee = 1990;
    // When
    const leapYear = isLeapYear(annee)
    // Then
    expect(leapYear).toBe(false);
});
