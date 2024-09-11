import java.util.Date;
import java.util.List;

public class Order {
    private List<Menu> items;
    private Customer customer;
    private Date orderDate;
    private boolean completed;

    public Order(List<Menu> items, Customer customer, Date orderDate) {
        this.items = items;
        this.customer = customer;
        this.orderDate = orderDate;
        this.completed = false;
    }

    public List<Menu> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeOrder() {
        this.completed = true;
    }
}
