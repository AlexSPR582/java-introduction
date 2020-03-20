package by.epam.courses.module2.array.task10;

public class ArrayTask10 {
    public int[] compressArray(int[] numbers){
        setZeros(numbers);
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] == 0){
                for (int j = i + 1; j < numbers.length; j++){
                    if (numbers[j] != 0){
                        numbers[i] = numbers[j];
                        numbers[j] = 0;
                        break;
                    }
                }
            }
        }
        return numbers;
    }

    private int[] setZeros(int[] numbers) {
        for (int i = 1; i < numbers.length; i++){
            numbers[i] = 0;
            i++;
        }
        return numbers;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
