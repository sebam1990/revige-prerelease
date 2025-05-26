package org.revige.products;

public class Bike extends Product{

    private double hourPrice;

    public Bike(){}

    public Bike(String description, double hourPrice, int stock) {
        super(description, hourPrice, stock);
        this.hourPrice = hourPrice/1.10;
    }

    @Override
    public double fraction(double hourPrice) {
        return hourPrice/12;
    }

    @Override
    public double halfStay(double hourPrice) {
        return hourPrice*12;
    }

    @Override
    public double fullStay(double hourPrice) {
        return hourPrice*24;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getHourPrice() {
        return hourPrice;
    }
}
