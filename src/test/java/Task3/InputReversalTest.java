package Task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InputReversalTest {
    InputReversal inputReversal;
    @BeforeEach
    public void setUp() {
        inputReversal = new InputReversal();
    }
    @ParameterizedTest
    @CsvSource({
            "olleh, hello",
            "@AB<p4124, 4214p<BA@",
            "'',''",
            "a,a",
    })
    public void userCanReverseInput(String expected, String input) {
        assertEquals(expected, inputReversal.reverse(input));
    }
    @Test
    public void userCanGetNullIfTryToReverseNullInput() {
        assertNull(inputReversal.reverse(null));
    }
}
