package com.MrJoints;

public class TaxCalculator2018 implements InterTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
     return taxableIncome * 0.03;
    }
}
