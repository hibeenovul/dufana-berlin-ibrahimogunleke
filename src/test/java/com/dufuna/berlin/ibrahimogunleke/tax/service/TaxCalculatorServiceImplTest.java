package com.dufuna.berlin.ibrahimogunleke.tax.service;

import com.dufuna.berlin.ibrahimogunleke.tax.model.TaxBracket;
import com.dufuna.berlin.ibrahimogunleke.tax.repository.TaxBracketRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaxCalculatorServiceImplTest {

    @Autowired
    private TaxCalculatorService calculator;

    @Autowired
    private TaxBracketRepository repository;

    @BeforeEach
    public void setUp() {
        // Wipe the vault clean to ensure a perfect testing environment
        repository.deleteAll();

        //
        TaxBracket bracket1 = new TaxBracket(0.0, 20000.0, 0.05);
        TaxBracket bracket2 = new TaxBracket(20000.0, 80000.0, 0.15);
        TaxBracket bracket3 = new TaxBracket(80000.0, Double.MAX_VALUE, 0.20);

        // Save the test folders to the H2 database
        repository.saveAll(Arrays.asList(bracket1, bracket2, bracket3));
    }

    @Test
    public void testCalculateTax() {
        double income = 20000.00;
        double actualTaxCalculated = calculator.calculateTax(income);
        double expectedTax = 1000.00;
        assertEquals(expectedTax, actualTaxCalculated);
    }

    @Test
    public void testCalculatorTax_withLowIncome() {
        double income = 5000.00;
        double actualTaxCalculated = calculator.calculateTax(income);
        double expectedTax = 250.00;
        assertEquals(expectedTax, actualTaxCalculated);
    }

    @Test
    public void testCalculatorTax_withHighIncome() {
        double income = 100000.00;
        double actualTaxCalculated = calculator.calculateTax(income);
        double expectedTax = 14000.00;
        assertEquals(expectedTax, actualTaxCalculated);
    }
}