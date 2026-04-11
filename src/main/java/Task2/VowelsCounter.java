package Task2;

public class VowelsCounter {
    //Напишите тесты для метода, который считает количество гласных букв в строке:
    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
