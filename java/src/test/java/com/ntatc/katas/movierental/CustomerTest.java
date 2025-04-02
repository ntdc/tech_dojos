package com.ntatc.katas.movierental;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    @Test
    public void test_sans_location() {
        // GIVEN
        Customer customer = new Customer("Bob");

        String attendu = "Rental Record for Bob\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points";

        // WHEN
        // THEN
        assertThat(attendu).isEqualTo(customer.statement());
    }

    // String attendu = "Rental Record for X\n" +
    //         "\tX\tX.X\n" +
    //         "Amount owed is X.X\n" +
    //         "You earned X frequent renter points";
}