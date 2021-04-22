public class ECommerceApp {

    public static void main (String[] args)
    {
        Customer cust = new Customer("Name", "address", 90162);
        OrderConstruction ordConstr = new OrderConstruction();
        Order order = ordConstr.getOrder(cust);
        order.add(new OrderItem(3, 4.67, "ABC08765"));
        order.add(new OrderItem(2, 1.87, "AEF45325"));
        System.out.println(order.getTotal());
    }
}
