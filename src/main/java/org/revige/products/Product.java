package org.revige.products;

public abstract class Product {

    private String description;
    private double hourPrice;
    private int stock;

    public Product() {}

    public Product(String description, double hourPrice, int stock) {
        this.description = description;
        this.hourPrice = hourPrice;
        this.stock = stock;
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

    public String getDescription() {
        return description;
    }

    public double getHourPrice() {
        return hourPrice;
    }

}


