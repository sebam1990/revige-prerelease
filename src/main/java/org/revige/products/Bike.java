package org.revige.products;

public class Bike extends Product{

    public Bike(){}

    public Bike(double hourPrice) {
        super(hourPrice);
    }

    @Override
    public double fraction(double hourPrice) {
        return (hourPrice/1.10)/12;
    }

    @Override
    public double halfStay(double hourPrice) {
        return (hourPrice/1.10)*12;
    }

    @Override
    public double fullStay(double hourPrice) {
        return (hourPrice/1.10)*24;
    }
}
