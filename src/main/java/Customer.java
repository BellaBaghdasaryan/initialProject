/** The Customer class provides information about buyer.*/
public class Customer {
    private String name;
    private String address;
    private int zip; // Postal code
    private String country;

    public Customer(String name, String address, int zip, String country) {
        this.zip = zip;
        this.name = name;
        this.address = address;
        this.country = country;
    }

    public int getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }
}
