package by.epam.courses.module2.array.task1;

public class ArrayTask1 {
    public int sumMultipleNumber(int k, int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % k == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}
