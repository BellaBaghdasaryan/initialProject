/** The OrderItem class provides information products available in Order.*/
public class OrderItem {

    private int quantity;
    private double price;
    private String upc;

    public OrderItem(int quantity, double price, String upc) {
        this.quantity = quantity;
        this.price = price;
        this.upc = upc;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
