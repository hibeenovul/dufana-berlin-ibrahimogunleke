package com.dufuna.berlin.ibrahimogunleke.tax.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// This class is our safe testing facility for the test calculator
public class TaxCalculatorServiceImplTest {

    // This annotation tells that this method is a test
    @Test
    public void testCalculateTax() {
        TaxCalculatorService calculator = new TaxCalculatorServiceImpl();

        double income = 20000.00;
        double actualTaxCalculated = calculator.calculateTax(income);
        double expectedTax = 1000.00;
        assertEquals(expectedTax, actualTaxCalculated);
    }

    @Test
    public void testCalculatorTax_withLowIncome() {
        TaxCalculatorService calculator = new TaxCalculatorServiceImpl();

        double income = 5000.00;
        double actualTaxCalculated = calculator.calculateTax(income);
        double expectedTax = 0.00;
        assertEquals(expectedTax, actualTaxCalculated);
    }

    @Test
    public void testCalculatorTax_withHighIncome() {
        TaxCalculatorService calculator = new TaxCalculatorServiceImpl();

        double income = 100000.00;
        double actualTaxCalculated = calculator.calculateTax(income);
        double expectedTax = 14000.00;
        assertEquals(expectedTax, actualTaxCalculated);
    }
}
