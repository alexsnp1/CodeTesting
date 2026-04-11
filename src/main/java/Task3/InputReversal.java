package Task3;

public class InputReversal {
    //Напишите тесты для метода, который переворачивает строку:
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
