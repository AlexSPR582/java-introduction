package by.epam.courses.module2.decomposition.task10;

public class DecompositionTask10 {
    public int[] createArrayNumber(int number) {
        int length = sizeNumber(number);
        int[] array = new int[length];
        int index = length - 1;
        while (index >= 0) {
            array[index] = number % 10;
            number = number  / 10;
            index--;
        }
        return array;
    }

    private int sizeNumber(int number){
        int size = 1;
        while (number > 9) {
            size++;
            number = number / 10;
        }
        return size;
    }
}
