package com.switchfully.springdi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmericanTaxCalculationTest {
    @Test
    void givenAmericanTaxCalculator_whenCalculateTaxFor10000_thenReturn2750() {
        AmericanTaxCalculation americanTaxCalculation = new AmericanTaxCalculation();
        Assertions.assertThat(americanTaxCalculation.calculateTax(10000.0)).isEqualTo(2750.0);
    }
}