package Task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {
    LeapYear leapYear;

    @BeforeEach
    public void setUp() {
        leapYear = new LeapYear();
    }
    @ParameterizedTest
    @ValueSource(ints = {0, 4, 400, 2000,-2020})
    public void userCanCheckLeapYear(int year) {
        assertTrue(leapYear.isLeapYear(year));
    }
    @ParameterizedTest
    @ValueSource(ints = {100, 1900,-300})
    public void userCanCheckCommonYear(int year) {
        assertFalse(leapYear.isLeapYear(year));
    }
}
