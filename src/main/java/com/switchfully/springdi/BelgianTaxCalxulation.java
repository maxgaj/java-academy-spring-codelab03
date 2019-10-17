package com.switchfully.springdi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BelgianTaxCalxulation implements TaxCalculation {

    public static final double TAX_RATE = 0.45;

    @Override
    public double calculateTax(double yearlyIncome) {
        return yearlyIncome * TAX_RATE;
    }
}
