package com.gm.sales;

public class Order {

    private int idOrder; //array declared
    private Product products[];
    private static int counterOrders;
    private int counterProducts;
    private static final int MAX_PRODUCTS = 10;

    public Order() {
        this.idOrder = ++counterOrders;
        //init array
        products = new Product[MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (this.counterProducts < MAX_PRODUCTS) {
            products[this.counterProducts++] = product;
        } else {
            System.out.println("Imposible to add more than " + MAX_PRODUCTS);
        }
    }

    public double calcTotal() {
        double total = 0;
        for (int i = 0; i < this.counterProducts; i++) {
            Product product = this.products[i];
            total += product.getPrice(); //total = total + product.getPrice()
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Order #:" + this.idOrder);
        System.out.println("Total order: " + this.calcTotal());
        System.out.println("Products of the order: " );
        for (int i = 0; i < this.counterProducts; i++) {
            System.out.println(products[i]);
        }
    }

}
