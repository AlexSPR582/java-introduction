package by.epam.courses.module2.array.task3;

public class ArrayTask3 {
    public int countPlusElements(int[] numbers) {
        int plusElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                plusElements += 1;
            }
        }
        return plusElements;
    }

    public int countNegativeElements(int[] numbers) {
        int negativeElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeElements += 1;
            }
        }
        return negativeElements;
    }

    public int countZeroElements(int[] numbers) {
        int zeroElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zeroElements += 1;
            }
        }
        return zeroElements;
    }
}
