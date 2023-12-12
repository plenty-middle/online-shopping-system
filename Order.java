// Order.java

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayInfo() {
        System.out.println("Order ID: " + orderId);
        customer.displayInfo();

        System.out.println("Products in the order:");
        for (Product product : products) {
            product.displayInfo();
        }
    }
}
