package com.dufuna.berlin.ibrahimogunleke.tax.service;

/**
 * This is the interface(contract) for our Tax Calculator
 * Any class that implements this interface Must provide the math to calculate the tax
 */

public interface TaxCalculatorService {
    /**
     * Calculates the total tax owed based on given income
     * @param income the total amount of money a person generated
     * @return the total tax amount owed
     */
    double calculateTax(double income);
}
