package com.jsp.wfm.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

public class DiscountCalculatorTest {

    @ParameterizedTest
    @ArgumentsSource(CustomArgumentsProvider.class)
    public void testWithCustomArgumentsSource(double purchaseAmount, double expectedDiscount) {
        DiscountCalculator calculator = new DiscountCalculator();
        double actualDiscount = calculator.calculateDiscount(purchaseAmount);
        Assertions.assertEquals(expectedDiscount, actualDiscount);
    }

    @Test
    public void domeTest() {
        Assertions.assertTrue(true);
    }
}

class CustomArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(400.0, 40.0),
                Arguments.of(500.0, 50.0)
        );
    }
}