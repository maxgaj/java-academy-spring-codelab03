package com.switchfully.springdi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BelgianTaxCalxulationTest {
    @Test
    void givenBelgianTaxCalculation_whenCalculateTaxFor10000_thenReturns4500() {
        BelgianTaxCalxulation belgianTaxCalxulation = new BelgianTaxCalxulation();
        Assertions.assertThat(belgianTaxCalxulation.calculateTax(10000)).isEqualTo(4500);
    }
}