package org.revige.products;

public class Scooter extends Product{

    public Scooter(){}

    public Scooter(double hourPrice) {
        super(hourPrice);
    }

    @Override
    public double fraction(double hourPrice) {
        return (hourPrice/1.30)/12;
    }

    @Override
    public double halfStay(double hourPrice) {
        return (hourPrice/1.30)*12;
    }

    @Override
    public double fullStay(double hourPrice) {
        return (hourPrice/1.30)*24;
    }
}
