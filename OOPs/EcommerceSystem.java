class Product {
    int productId;
    String name;
    double price;
    int stockQuantity;

    // Constructor
    Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    void displayProduct() {
        System.out.println(productId + " " + name + " " + price + " " + stockQuantity);
    }
}

class Customer {
    int customerId;
    String name;
    String email;

    // Constructor
    Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    void displayCustomer() {
        System.out.println(customerId + " " + name + " " + email);
    }
}

class Order {
    int orderId;
    String orderDate;
    Product[] products;
    Customer customer;

    // Constructor
    Order(int orderId, String orderDate, Customer customer, Product[] products) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customer = customer;
        this.products = products;
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Customer: " + customer.name);

        System.out.println("Products Ordered:");
        for(Product p : products) {
            System.out.println(p.name + " - " + p.price);
        }
    }
}
    
public class EcommerceSystem {
    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 65000, 10);
        Product p2 = new Product(102, "Mouse", 500, 50);

        Customer c1 = new Customer(201, "Akanksha", "akanksha@email.com");

        Product[] productList = {p1, p2};

        Order order1 = new Order(301, "10-03-2026", c1, productList);

        order1.displayOrder();
    }
}
