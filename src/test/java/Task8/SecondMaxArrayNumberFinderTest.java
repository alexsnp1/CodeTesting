package Task8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondMaxArrayNumberFinderTest {
   SecondMaxArrayNumberFinder secondMaxArrayNumberFinder;
   @BeforeEach
   public void setUp() {
       secondMaxArrayNumberFinder = new SecondMaxArrayNumberFinder();
   }

   public static Stream<Arguments> validArrays() {
       return Stream.of(
               Arguments.of(3,new int[] {3,5,2,1,0}),
               Arguments.of(-5,new int[] {-10,-3,-5}));
   }
   @ParameterizedTest
   @MethodSource("validArrays")
   public void userCanFindSecondMaxNumberInArray(int expected, int[] array) {
       assertEquals(expected,secondMaxArrayNumberFinder.findSecondMax(array));
   }
    @Test
    public void userCanGetExceptionIfArrayConsistsOfSameNumbers() {
        assertThrows(NoSuchElementException.class, () -> secondMaxArrayNumberFinder.findSecondMax(new int[] {2,2,2,2,2}));
    }
    @Test
    public void userCanGetExceptionIfArrayIsNull() {
        assertThrows(NullPointerException.class, () -> secondMaxArrayNumberFinder.findSecondMax(null));
    }
    @Test
    public void userCanGetExceptionIfArrayConsistsOfOnlyOneNumber() {
        assertThrows(IllegalArgumentException.class, () -> secondMaxArrayNumberFinder.findSecondMax(new int[] {1}));
    }

}
