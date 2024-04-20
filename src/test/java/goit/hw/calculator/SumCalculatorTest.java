package goit.hw.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    @DisplayName("Sum should return 1 when 1 is passed")
    void sumShouldReturnOneWhenOneIsPassed() {
        int actual = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sum should return 6 when 3 is passed")
    void sumShouldReturnSixWhenThreeIsPassed() {
        int actual = calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sum should throw IllegalArgumentException when 0 is passed")
    void sumShouldThrowIllegalArgumentExceptionWhenZeroIsPassed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
