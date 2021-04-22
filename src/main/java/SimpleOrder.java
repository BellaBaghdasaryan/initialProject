import java.util.ArrayList;
import java.util.List;

/** Concrete order. Implements Simple order. */
public class SimpleOrder implements Order{
    private List<OrderItem> orders = new ArrayList<>();
    private Customer cust;

    public SimpleOrder(Customer cust) {
        this.cust = cust;
    }

    public void add(OrderItem item) {
        orders.add(item);
    }
    /** Returns placed order's total price*/
    public double getTotal() {
        double total = 0;
        TaxContext calculator = new TaxContext();
        for (OrderItem item : orders) {
            total += item.getPrice()*item.getQuantity() + calculator.calculateTax(cust.getZip());
        }
        return (total * calculator.calculateTax(cust.getZip()))/100 + total;
    }
}
