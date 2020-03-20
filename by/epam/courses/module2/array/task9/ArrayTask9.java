package by.epam.courses.module2.array.task9;

public class ArrayTask9 {
    public int findMostRepeatNumber(int[] numbers) {
        int maxRepeatNumber = numbers[0];
        int maxRepeat = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (repeat(numbers[i], numbers) > maxRepeat) {
                maxRepeat = repeat(numbers[i], numbers);
                maxRepeatNumber = numbers[i];
            }
            else if (repeat(numbers[i], numbers) == maxRepeat
                    && numbers[i] < maxRepeatNumber) {
                maxRepeat = repeat(numbers[i], numbers);
                maxRepeatNumber = numbers[i];
            }
        }
        return maxRepeatNumber;
    }

    private int repeat(int number, int[] numbers) {
        int repeat = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                repeat++;
            }
        }
        return repeat;
    }
}
