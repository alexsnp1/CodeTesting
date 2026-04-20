package Task10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneValidationTest {
    PhoneValidation phoneValidation;

    @BeforeEach
    public void setUp(){
        phoneValidation = new PhoneValidation();
    }
    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890","+44 1234567890", "+347 9098755439"})
    public void userCanCheckValidPhone(String phone) {
        assertTrue(phoneValidation.isValidPhoneNumber(phone));
    }
    @ParameterizedTest
    @ValueSource(strings = {"1 1234567890", "+347009875543", "1",
            "+1213124 1234567890", "+1 1246871269451126841", "+asd 9q8radakdu", " "})
    public void userCanCheckInValidPhone(String phone) {
        assertFalse(phoneValidation.isValidPhoneNumber(phone));
    }
    @Test
    public void userCanCheckIfPhoneIsNull() {
        assertThrows(NullPointerException.class,() -> phoneValidation.isValidPhoneNumber(null));
    }
}
