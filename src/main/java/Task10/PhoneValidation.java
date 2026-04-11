package Task10;

public class PhoneValidation {
    //Напишите тесты для метода, который проверяет валидность телефонного номера:
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}
