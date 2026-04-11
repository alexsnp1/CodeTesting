package Task4;

import java.util.Arrays;

public class MaxNumberFinder {
    //Напишите тесты для метода, который находит максимальное число в массиве:
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
