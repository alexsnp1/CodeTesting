package Task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordsCounterTest {
    WordsCounter wordsCounter;

    @BeforeEach
    public void setUp() {
        wordsCounter = new WordsCounter();
    }
    @ParameterizedTest
    @CsvSource({
            "2, 'Hel241lo, wo421rld'",
            "4, 'I  gonna  do    it'",
            "0, ''",
            "0, '   '"
    })
    public void userCanCountWordsInString(int expected, String string) {
        assertEquals(expected,wordsCounter.countWords(string));
    }
    @Test
    public void userCanGetExceptionIfStringIsNull() {
        assertThrows(NullPointerException.class, () -> wordsCounter.countWords(null));
    }
}
