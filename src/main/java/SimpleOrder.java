import java.util.ArrayList;
import java.util.List;

/** Concrete order. Implements Simple order. */
public class SimpleOrder implements Order{
    private List<OrderItem> orders = new ArrayList<>();
    private Customer cust;
    private TaxCalculator calculator;

    public SimpleOrder(Customer cust) {
        this.cust = cust;
        TaxFactory factory = new TaxFactory();
        this.calculator = factory.getTax(cust);
    }

    public void add(OrderItem item) {
        orders.add(item);
    }
    /** Returns placed order's total price*/
    public double getTotal() {
        double total = 0;
        for (OrderItem item : orders) {
            total += item.getPrice()*item.getQuantity();
        }
        return calculator.applyTax(total, cust);
    }
}
