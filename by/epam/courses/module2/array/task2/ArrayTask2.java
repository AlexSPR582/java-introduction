package by.epam.courses.module2.array.task2;

public class ArrayTask2 {
    public int[] replace(int z, int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > z){
                numbers[i] = z;
            }
        }
        return numbers;
    }

    public int countReplacement(int z, int[] numbers) {
        int replacement = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > z) {
                replacement++;
            }
        }
        return replacement;
    }
}
