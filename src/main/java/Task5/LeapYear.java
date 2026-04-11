package Task5;

public class LeapYear {
    //Напишите тесты для метода, который определяет, является ли год високосным:
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
