package Task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VowelsCounterTest {
    VowelsCounter counter;
    @BeforeEach
    public void setUp() {
        counter = new VowelsCounter();
    }
    @ParameterizedTest
    @CsvSource({
            "2, hello",
            "2, JaVA",
            "0, DSDWDWDWGR",
            "6, AEOIoo",
            "0, ''"
    })
    public void userCanCountVowels(int number, String input) {
        assertEquals(number, counter.countVowels(input));
    }
    @Test
    public void userCanGetExceptionIfCountVowelsIsNull() {
        assertThrows(IllegalArgumentException.class, () -> counter.countVowels(null));
    }

}
