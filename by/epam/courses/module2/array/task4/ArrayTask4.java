package by.epam.courses.module2.array.task4;

public class ArrayTask4 {
    public int[] swapMinMaxElement(int[] numbers){
        int minIndex = indexMinElement(numbers);
        int maxIndex = indexMaxElement(numbers);
        int buffer = numbers[maxIndex];
        numbers[maxIndex] = numbers[minIndex];
        numbers[minIndex] = buffer;
        return numbers;
    }

    private int indexMinElement(int[] numbers) {
        int indexMin = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    private int indexMaxElement(int[] numbers) {
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
