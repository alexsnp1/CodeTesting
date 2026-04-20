package Task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidationTest {
    EmailValidation emailValidation;

    @BeforeEach
    public void setUp() {
        emailValidation = new EmailValidation();
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@mail.com", "a@mail.ru", "a.b2-3c@test2.co"})
    public void userCanCheckIfEmailIsValid(String email) {
        assertTrue(emailValidation.isValidEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"testmail.com", "@mail.ru", "a.b2-3c@.co", "a@test.c", ""})
    public void userCanCheckIfEmailIsInValid(String email) {
        assertFalse(emailValidation.isValidEmail(email));
    }
    @Test
    public void userCanCheckIfEmailIsNull() {
        assertFalse(emailValidation.isValidEmail(null));
    }
}
