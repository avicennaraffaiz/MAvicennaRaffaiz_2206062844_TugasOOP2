import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat objek menu item
        Menu item1 = new Menu("Burger", 5.99);
        Menu item2 = new Menu("Fries", 2.99);
        
        // Membuat objek customer
        Customer customer1 = new Customer("John", "C001");
        
        // Membuat objek order
        Order order1 = new Order(Arrays.asList(item1, item2), customer1, new Date());
        
        // Menampilkan informasi order
        System.out.println("Customer: " + order1.getCustomer().getName());
        System.out.println("Order Date: " + order1.getOrderDate());
        System.out.println("Items Ordered: ");
        for (Menu item : order1.getItems()) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
        
        // Menyelesaikan order
        order1.completeOrder();
        System.out.println("Order Completed: " + order1.isCompleted());
    }
}
