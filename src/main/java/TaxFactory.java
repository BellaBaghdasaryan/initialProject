/** TaxFactory creates different TaxCalculators */
public class TaxFactory {
    private static final String US = "USA";
    public TaxCalculator getTax(Customer cust) {
        if(cust.getCountry().equals(US)) return new TaxCalculatorUS();
        return null;
    }
}
