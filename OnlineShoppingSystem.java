// OnlineShoppingSystem.java

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer(1, "Alice", "alice@example.com");
        Customer customer2 = new Customer(2, "Bob", "bob@example.com");

        // Create products
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(102, "Smartphone", 499.99);

        // Create orders
        Order order1 = new Order(1001, customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(1002, customer2);
        order2.addProduct(product2);

        // Display information
        System.out.println("Order Information:");
        order1.displayInfo();
        System.out.println();
        order2.displayInfo();
    }
}
