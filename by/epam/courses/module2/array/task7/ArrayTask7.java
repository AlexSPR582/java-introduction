package by.epam.courses.module2.array.task7;

public class ArrayTask7 {
    public int changeArrayAndFindMax(int[] numbers) {
        int[] newArray = createNewArray(numbers);
        return findMax(newArray);
    }

    private int[] createNewArray(int[] numbers) {
        int[] newArray = new int[numbers.length / 2];
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;
        while (leftIndex < rightIndex) {
            newArray[leftIndex] = numbers[leftIndex] + numbers[rightIndex];
            leftIndex += 1;
            rightIndex -= 1;
        }
        return newArray;
    }

    private int findMax(int[] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
