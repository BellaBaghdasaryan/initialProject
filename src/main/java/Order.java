/** The Order interface provides methods to manage order placed by customer.*/
public interface Order {
    double getTotal();
    void add(OrderItem item);
}
