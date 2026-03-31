package com.dufuna.berlin.ibrahimogunleke.tax.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tax_brackets")
public class TaxBracket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double minimumIncome;
    private double maximumIncome;
    private double rate;

    // The mandatory empty constructor for the Database
    public TaxBracket() {
    }

    // The constructor for your test files
    public TaxBracket(double minimumIncome, double maximumIncome, double rate) {
        this.minimumIncome = minimumIncome;
        this.maximumIncome = maximumIncome;
        this.rate = rate;
    }

    // --- GETTERS AND SETTERS ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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