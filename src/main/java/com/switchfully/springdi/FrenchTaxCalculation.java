package com.switchfully.springdi;

import org.springframework.stereotype.Component;

@Component
public class FrenchTaxCalculation implements TaxCalculation {

    public static final double TAX_RATE = 0.48;

    @Override
    public double calculateTax(double yearlyIncome) {
        return yearlyIncome * TAX_RATE;
    }
}
