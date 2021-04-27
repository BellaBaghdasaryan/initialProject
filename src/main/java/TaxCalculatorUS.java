/** Concrete tax calculator. Implements tax calculation in US.*/
public class TaxCalculatorUS implements TaxCalculator {
    private static final int CALIFORNIA_MIN_INDEX = 90001;
    private static final int CALIFORNIA_MAX_INDEX = 96162;
    private static final double CALIFORNIA_PERCENTAGE = 7.25;

    @Override
    public double applyTax(double amount, Customer cust) {
        if (cust.getZip() < CALIFORNIA_MAX_INDEX && cust.getZip() > CALIFORNIA_MIN_INDEX)
            return (amount * CALIFORNIA_PERCENTAGE)/100 + amount;
        return amount;
    }
}
