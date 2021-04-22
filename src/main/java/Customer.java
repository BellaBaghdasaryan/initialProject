/** The Customer class provides information about buyer.*/
public class Customer {
    private String name;
    private String address;
    private int zip; // Postal code

    public Customer(String name, String address, int zip) {
        this.zip = zip;
        this.name = name;
        this.address = address;
    }

    public int getZip() {
        return zip;
    }
}
