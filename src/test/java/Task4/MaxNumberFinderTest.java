package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxNumberFinderTest {
    MaxNumberFinder finder;
    @BeforeEach
    public void setUp() {
        finder = new MaxNumberFinder();
    }
    public static Stream<Arguments> validArrays() {
        return Stream.of(
                Arguments.of(5,new int[] {-3,2,5,1,0}),
                Arguments.of(1,new int[] {1}),
                Arguments.of(-5,new int[] {-5, -100, -10}));
    }
    @ParameterizedTest
    @MethodSource("validArrays")
    public void userCanFindMaxNumberInArray(int expected, int[] array) {
        assertEquals(expected, finder.findMax(array));
    }
    @Test
    public void userCanGetExceptionIfArrayIsNull() {
        assertThrows(NullPointerException.class, () -> finder.findMax(null));
    }

}
