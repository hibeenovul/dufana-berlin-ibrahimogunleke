package com.dufuna.berlin.ibrahimogunleke.tax.model;

/**
 * This Entity represent a single tax bracket.
 * It holds the rules for a specific income rage
 */

public class TaxBracket {
    // The lowest amount of money for this bracket
    private double minimumIncome;

    // The highest amount of money for this bracket
    private double maximumIncome;

    //The percentage of Tax (e.g, 0.10 for 10%)
    private double rate;


    // All-args constructor to quickly create a bracket
    public TaxBracket(double minimumIncome, double maximumIncome, double rate) {
        this.minimumIncome = minimumIncome;
        this.maximumIncome = maximumIncome;
        this.rate = rate;
    }

    // --- GETTERS AND SETTERS (Encapsulation) ---
    public double getMinimumIncome() {
        return minimumIncome;
    }
    public void setMinimumIncome(double minimumIncome) {
        this.minimumIncome = minimumIncome;
    }

    public double getMaximumIncome() {
        return maximumIncome;
    }
    public void setMaximumIncome(double maximumIncome) {
        this.maximumIncome = maximumIncome;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
}
