package com.switchfully.springdi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfig {

    @Bean("americanTaxCalculator")
    public TaxCalculator getAmericanTaxCalculator(@Qualifier("americanTaxCalculation") TaxCalculation taxCalculation) {
        return new TaxCalculator(taxCalculation);
    }

    @Bean("americanTaxCalculation")
    public TaxCalculation getAmericanTaxCalculation() {
        return new AmericanTaxCalculation();
    }

    @Bean("frenchTaxCalculator")
    public TaxCalculator getFrenchTaxCalculator(@Qualifier("frenchTaxCalculation") TaxCalculation taxCalculation) {
        return new TaxCalculator(taxCalculation);
    }

    @Bean("frenchTaxCalculation")
    public TaxCalculation getFrenchTaxCalculation() {
        return new AmericanTaxCalculation();
    }

    @Bean("belgianTaxCalculator")
    public TaxCalculator getBelgianTaxCalculator(@Qualifier("belgianTaxCalculation") TaxCalculation taxCalculation) {
        return new TaxCalculator(taxCalculation);
    }

    @Bean("belgianTaxCalculation")
    public TaxCalculation getBelgianTaxCalculation() {
        return new AmericanTaxCalculation();
    }
}
