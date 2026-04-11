package Task9;

public class WordsCounter {
    //Напишите тесты для метода, который считает количество слов в строке:
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
