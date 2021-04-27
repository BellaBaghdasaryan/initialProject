/** The OrderConstruction class */
public class OrderConstruction {
    public Order getOrder(Customer cust) {
        return new SimpleOrder(cust);
    }
}
