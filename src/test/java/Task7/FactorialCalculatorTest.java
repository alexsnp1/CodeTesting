package Task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculatorTest {
    FactorialCalculator factorialCalculator;

    @BeforeEach
    public void setUp() {
        factorialCalculator = new FactorialCalculator();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "1, 1",
            "120, 5"
    })
    public void userCanCalculateFactorial(int expected, int number) {
        assertEquals(expected,factorialCalculator.factorial(number));
    }
    @Test
    public void userCanCalculateFactorial() {
        assertThrows(IllegalArgumentException.class, () -> factorialCalculator.factorial(-5));
    }
}
