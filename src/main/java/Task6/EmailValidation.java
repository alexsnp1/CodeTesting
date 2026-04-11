package Task6;

public class EmailValidation {
    //Напишите тесты для метода, который проверяет, является ли строка валидным email:
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }
}
