package com.switchfully.springdi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrenchTaxCalculationTest {

    @Test
    void givenFrenchTaxCalculation_whenCalculateTaxFor10000_thenReturns4800() {
        FrenchTaxCalculation frenchTaxCalculation = new FrenchTaxCalculation();
        Assertions.assertThat(frenchTaxCalculation.calculateTax(10000)).isEqualTo(4800);
    }

}