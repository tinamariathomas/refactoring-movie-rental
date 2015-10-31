package com.tw;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;

    private String title;
    private int priceCode;

    private double baseAmount;

    public Movie(String title, int priceCode,double baseAmount) {
        this.title = title;
        this.priceCode = priceCode;
        this.baseAmount = baseAmount;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle() {
        return title;
    }


    public boolean isMovieOfPriceCode(int newRelease) {
        return getPriceCode()==newRelease;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public static Movie createChildrensMovie(String title){
        return new Movie(title,Movie.CHILDRENS,1.5);
    }
}
