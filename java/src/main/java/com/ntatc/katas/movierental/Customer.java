package com.ntatc.katas.movierental;

import java.util.Vector;

public class Customer {

    private String _name;
    private Vector<Rental> _rentals = new Vector<>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        // Header - Information du client
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";

        // Body - Détail des locations (titre et prix) + Calcul du coût total en parallèle
        for (Rental each : _rentals) {
            double thisAmount = 0;

            // Calcul du prix de la location - Determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            // Calcul des points de fidélité - Frequent renter points
            frequentRenterPoints++;

            // Ajout d'un second point de fidélité pour les locations de nouvelles sorties pour plus d'un 1 jours
            // Bonus renter point for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints++;

            // "Affichage" de la location avec son prix - Show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";

            // Calcul du coût total de la location
            totalAmount += thisAmount;
        }

        // Footer - "Affichage" du coût total de la location et Total de points de fidélité
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }
}
