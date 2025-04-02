package com.ntatc.katas.movierental;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    @Test
    public void should_return_statement_with_no_rental() {
        // GIVEN
        Customer customer = new Customer("John Doe");

        String attendu = "Rental Record for John Doe\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points";

        // WHEN
        // THEN
        assertThat(attendu).isEqualTo(customer.statement());
    }

    @Test
    public void should_return_statement_with_1_rental_REGULAR_for_1_day() {
        // GIVEN
        Customer customer = new Customer("James Cameron");
        Movie movie = new Movie("Avatar", Movie.REGULAR);
        Rental rental = new Rental(movie, 1);
        customer.addRental(rental);

        String attendu = "Rental Record for James Cameron\n" +
                "\tAvatar\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }

    @Test
    public void should_return_statement_with_1_rental_REGULAR_for_2_days() {
        // GIVEN
        Customer customer = new Customer("James Cameron");
        Movie movie = new Movie("Avatar", Movie.REGULAR);
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String attendu = "Rental Record for James Cameron\n" +
                "\tAvatar\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }

    @Test
    public void should_return_statement_with_1_rental_REGULAR_for_3_days() {
        // GIVEN
        Customer customer = new Customer("James Cameron");
        Movie movie = new Movie("Avatar", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String attendu = "Rental Record for James Cameron\n" +
                "\tAvatar\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }

    @Test
    public void should_return_statement_with_1_rental_NEW_RELEASE_for_1_day() {
        // GIVEN
        Customer customer = new Customer("Brothers Russo");
        Movie movie = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 1);
        customer.addRental(rental);

        String attendu = "Rental Record for Brothers Russo\n" +
                "\tAvengers: Endgame\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }

    @Test
    public void should_return_statement_with_1_rental_NEW_RELEASE_for_2_days() {
        // GIVEN
        Customer customer = new Customer("Brothers Russo");
        Movie movie = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String attendu = "Rental Record for Brothers Russo\n" +
                "\tAvengers: Endgame\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }

    @Test
    public void should_return_statement_with_1_rental_NEW_RELEASE_for_3_days() {
        // GIVEN
        Customer customer = new Customer("Brothers Russo");
        Movie movie = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String attendu = "Rental Record for Brothers Russo\n" +
                "\tAvengers: Endgame\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }

    @Test
    public void should_return_statement_with_1_rental_CHILDRENS_for_1_day() {
        // GIVEN
        Customer customer = new Customer("Kelsey Mann");
        Movie movie = new Movie("Vice-versa 2", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 1);
        customer.addRental(rental);

        String attendu = "Rental Record for Kelsey Mann\n" +
                "\tVice-versa 2\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }

    @Test
    public void should_return_statement_with_1_rental_CHILDRENS_for_3_days() {
        // GIVEN
        Customer customer = new Customer("Kelsey Mann");
        Movie movie = new Movie("Vice-versa 2", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String attendu = "Rental Record for Kelsey Mann\n" +
                "\tVice-versa 2\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }

    @Test
    public void should_return_statement_with_1_rental_CHILDRENS_for_4_days() {
        // GIVEN
        Customer customer = new Customer("Kelsey Mann");
        Movie movie = new Movie("Vice-versa 2", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 4);
        customer.addRental(rental);

        String attendu = "Rental Record for Kelsey Mann\n" +
                "\tVice-versa 2\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }

    @Test
    public void should_return_statement_with_2_rentals_REGULAR_AND_NEW_RELEASE_for_4_days() {
        // GIVEN
        Customer customer = new Customer("Pierre K");
        Movie movie1 = new Movie("Avengers", Movie.REGULAR);
        Rental rental1 = new Rental(movie1, 4);
        Movie movie2 = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);
        Rental rental2 = new Rental(movie2, 4);
        customer.addRental(rental1);
        customer.addRental(rental2);

        String attendu = "Rental Record for Pierre K\n" +
                "\tAvengers\t5.0\n" +
                "\tAvengers: Endgame\t12.0\n" +
                "Amount owed is 17.0\n" +
                "You earned 3 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }

    @Test
    public void should_return_statement_with_2_rentals_CHILDRENS_AND_CHILDRENS_for_7_days() {
        // GIVEN
        Customer customer = new Customer("Pierre K");
        Movie movie1 = new Movie("Vice-versa", Movie.CHILDRENS);
        Rental rental1 = new Rental(movie1, 7);
        Movie movie2 = new Movie("Vice-versa 2", Movie.CHILDRENS);
        Rental rental2 = new Rental(movie2, 7);
        customer.addRental(rental1);
        customer.addRental(rental2);

        String attendu = "Rental Record for Pierre K\n" +
                "\tVice-versa\t7.5\n" +
                "\tVice-versa 2\t7.5\n" +
                "Amount owed is 15.0\n" +
                "You earned 2 frequent renter points";

        // WHEN
        // THEN
        assertThat(customer.statement()).isEqualTo(attendu);
    }
}