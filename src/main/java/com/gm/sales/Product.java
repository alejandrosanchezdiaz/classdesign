
package com.gm.sales;

public class Product {
    private int idProduct;
    private String name;
    private double price;
    private static int counterProduct;
    
    //empty
    
    private Product(){
        this.idProduct = ++counterProduct;
        
       
    }
    
}
