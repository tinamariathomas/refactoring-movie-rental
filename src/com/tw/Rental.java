package com.tw;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getRentalAmount() {
        double thisAmount = 0;
        thisAmount += getMovie().getBaseAmount();

        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                if (getDaysRented() > 2)
                    thisAmount += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                if (getDaysRented() > 3)
                    thisAmount += (getDaysRented() - 3) * 1.5;
                break;
        }

        return thisAmount;
    }

    public int getFrequentRentalPoints() {
        if (movie.isMovieOfPriceCode(Movie.NEW_RELEASE) && getDaysRented() > 1)
            return 2;
        else return 1;
    }
}
