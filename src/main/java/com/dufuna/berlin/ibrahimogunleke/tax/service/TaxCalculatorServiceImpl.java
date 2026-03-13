package com.dufuna.berlin.ibrahimogunleke.tax.service;

import com.dufuna.berlin.ibrahimogunleke.tax.model.TaxBracket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//This is the actual worker class that  does the heavy lifting and math.

@Service //This is the annotation that tells spring framework to manage this class!
public class TaxCalculatorServiceImpl implements TaxCalculatorService {

    // A list to hold our reusable tax buckets
    private final List<TaxBracket> taxBrackets;

    //The Constructor. when spring creates this worker, it instantly builds the buckets.
    public TaxCalculatorServiceImpl() {
        taxBrackets = new ArrayList<>();

        // Bucket 1: $0 to $10,000 (0% tax)
        taxBrackets.add(new TaxBracket(0, 1000, 0.0));

        // Bucket 2: $10,000 to $50,000 (10% tax)
        taxBrackets.add(new TaxBracket(10000, 50000, 0.10));

        //Bucket 3: $50,000 and above (20% tax). we will have a huge maximum number
        taxBrackets.add(new TaxBracket(50000, 1000000000, 0.20));
    }
    @Override
    public double calculateTax(double income) {
        double totalTax = 0.0; // starting with zero tax owed

        for (TaxBracket bracket : taxBrackets) {
            // check if the person make enough money to reach this bucket
            if (income > bracket.getMinimumIncome()) {
                double taxableAmount = Math.min(income, bracket.getMaximumIncome()) - bracket.getMinimumIncome();

                // Multiplying the money by the bucket's tax percentage
                double tax = taxableAmount * bracket.getRate();

                // Add it to the total bill
                totalTax = totalTax + tax;
            }
        }
        // Final bill back to the user
        return totalTax;
    }
}
