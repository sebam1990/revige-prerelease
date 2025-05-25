package org.revige.products;

abstract class Product {

    private double hourPrice;

    public Product() {}

    public Product(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    public double fraction(double hourPrice){

        return hourPrice/12;

    }

    public double halfStay(double hourPrice){

        return hourPrice*12;

    }

    public double fullStay(double hourPrice){

        return hourPrice*24;

    }

}


