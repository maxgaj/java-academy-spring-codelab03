package com.switchfully.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaxApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TaxCalculator taxCalculator = context.getBean("americanTaxCalculator", TaxCalculator.class);
        System.out.println(taxCalculator.calculateTax(23000.0));
    }
}
