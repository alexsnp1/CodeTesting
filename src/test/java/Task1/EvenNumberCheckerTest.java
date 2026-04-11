package Task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenNumberCheckerTest {
    EvenNumberChecker checker;

    @BeforeEach
    public void setUp() {
        checker = new EvenNumberChecker();
    }
    @ParameterizedTest
    @ValueSource(ints = {4,0,-4})
    public void userCanCheckEvenNumber(int number) {
       assertTrue(checker.isEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {1,-1})
    public void userCanCheckOddNumber(int number) {
        assertFalse(checker.isEven(number));
    }
}
