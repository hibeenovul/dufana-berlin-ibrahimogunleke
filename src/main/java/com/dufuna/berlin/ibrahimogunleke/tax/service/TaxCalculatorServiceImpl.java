package com.dufuna.berlin.ibrahimogunleke.tax.service;

import com.dufuna.berlin.ibrahimogunleke.tax.model.TaxBracket;
import com.dufuna.berlin.ibrahimogunleke.tax.repository.TaxBracketRepository;
import org.springframework.stereotype.Service;


import java.util.List;

//This is the actual worker class that  does the heavy lifting and math.

@Service //This is the annotation that tells spring framework to manage this class!
public class TaxCalculatorServiceImpl implements TaxCalculatorService {
    private final TaxBracketRepository taxBracketRepository;

    public TaxCalculatorServiceImpl(TaxBracketRepository taxBracketRepository) {
        this.taxBracketRepository = taxBracketRepository;
    }

    /*@Override
    public double calculateTax( double income) {
        List<TaxBracket> taxBrackets = taxBracketRepository.findAll();

        double totalTax = 0.0;

        for (TaxBracket bracket : taxBrackets) {
            if (income > bracket.getMinimumIncome()) {
                double taxableAtThisBracket = Math.min(income, bracket.getMaximumIncome() - bracket.getMinimumIncome());
                totalTax += taxableAtThisBracket* bracket.getRate();
            }
        }
        return totalTax;
    }*/

    @Override
    public double calculateTax(double income) {

        // Retrieve tax brackets from the H2 Database
        List<TaxBracket> brackets = taxBracketRepository.findAll();

        double totalTax = 0.0;

        // Calculate progressive tax
        for (TaxBracket bracket : brackets) {
            if (income > bracket.getMinimumIncome()) {
                double taxableAtThisBracket = Math.min(income, bracket.getMaximumIncome()) - bracket.getMinimumIncome();
                totalTax += taxableAtThisBracket * bracket.getRate();
            }
        }

        return totalTax;
    }
}
