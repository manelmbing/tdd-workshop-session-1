package es.ing.tddworkshopsession1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciCalculatorTest {

    @Test
    void shouldReturnZeroWhenInputIsZero() {
        assertEquals(0, FibonacciCalculator.getValueAtIndex(0));
    }

    @Test
    void shouldReturnOneWhenInputIsOne() {
        assertEquals(1, FibonacciCalculator.getValueAtIndex(1));
    }

    @Test
    void shouldReturnTwoWhenInputIsThree() {
        assertEquals(2, FibonacciCalculator.getValueAtIndex(3));
    }

}
