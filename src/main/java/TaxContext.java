/** TaxContext creates different strategies of tax calculation. */
public class TaxContext {
    private final TaxCalculator calculator;

    public TaxContext() {
        this.calculator = new TaxCalculatorUS();
    }

    public double calculateTax(int zip) {
        return calculator.getTax(zip);
    }
}
