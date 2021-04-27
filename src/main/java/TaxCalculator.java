/**
 * Common TaxCalculator interface to calculate tax in any area.
 */
public interface TaxCalculator {
    double applyTax(double amount, Customer cust);
}
