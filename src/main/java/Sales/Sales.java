package Sales;

import com.gm.sales.*;

public class Sales {
    public static void main(String[] args) {
        //Let's create a buch of product type objects
        Product product1 = new Product("Shirt", 50);
        Product product2 = new Product("Trousers", 100);
        
        //Let's create and order type object
        Order order1 = new Order();
        //Add products into the Order Object
        order1.addProduct(product1);
        order1.addProduct(product2);
        
        //Print the order
        order1.showOrder();
        
        
    }
}
