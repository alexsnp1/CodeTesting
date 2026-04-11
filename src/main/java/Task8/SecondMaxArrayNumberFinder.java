package Task8;

import java.util.Arrays;

public class SecondMaxArrayNumberFinder {
    //Напишите тесты для метода, который находит второе по величине число:
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }
}
