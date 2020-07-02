package com.gm.sales;

public class Product {

    private int idProduct;
    private String name;
    private double price;
    private static int counterProduct;

    //empty
    private Product() {
        this.idProduct = ++counterProduct;

    }

    //second constructor 2 elements
    public Product(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCounterProduct() {
        return counterProduct;
    }

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", name=" + name + ", price=" + price + '}';
    }

   
}
