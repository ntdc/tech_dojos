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

    /**
     * TODO Déplacer
     */
    @Test
    public void should_return_statement_with_1_rental_REGULAR_for_2_days() {
        // GIVEN
        Customer customer = new Customer("Robert Redford");
        Movie movie = new Movie("Swat", Movie.REGULAR);
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String attendu = "Rental Record for Robert Redford\n" +
                "\tSwat\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points";

        // WHEN
        // THEN
        assertThat(attendu).isEqualTo(customer.statement());
    }
}