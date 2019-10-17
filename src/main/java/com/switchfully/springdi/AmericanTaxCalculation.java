package com.switchfully.springdi;

import org.springframework.stereotype.Component;

@Component
public class AmericanTaxCalculation implements TaxCalculation {

    public static final double TAX_RATE = 0.18;
    public static final int LUMP_SUM = 950;

    @Override
    public double calculateTax(double yearlyIncome) {
        return yearlyIncome * TAX_RATE + LUMP_SUM;
    }
}
