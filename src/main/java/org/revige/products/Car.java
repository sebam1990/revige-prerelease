package org.revige.products;

public class Car extends Product{

    public Car(){}

    public Car(double hourPrice) {
        super(hourPrice);
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

}
