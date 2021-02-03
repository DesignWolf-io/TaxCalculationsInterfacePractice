package com.MrJoints;

public class TaxReport {
    private InterTaxCalculator calculator;

    public TaxReport(InterTaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
