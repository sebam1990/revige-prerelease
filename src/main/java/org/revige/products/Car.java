package org.revige.products;

public class Car extends Product{

    public Car(){}

    public Car(String description, double hourPrice, int stock) {
        super(description, hourPrice, stock);

    }

    @Override
    public double fraction(double hourPrice) {
        return super.fraction(hourPrice);
    }

    @Override
    public double halfStay(double hourPrice) {
        return super.halfStay(hourPrice);
    }

    @Override
    public double fullStay(double hourPrice) {
        return super.fullStay(hourPrice);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getHourPrice() {
        return super.getHourPrice();
    }
}
