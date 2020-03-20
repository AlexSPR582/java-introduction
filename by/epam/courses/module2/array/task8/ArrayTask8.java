package by.epam.courses.module2.array.task8;

public class ArrayTask8 {
    public int[] createArrayWithoutMinElement(int[] numbers){
        int[] newArray = new int[0];
        int min = findMin(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != min) {
                newArray = addElement(numbers[i], newArray);
            }
        }
        return newArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    private int[] addElement(int element, int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = element;
        return newArray;
    }
}
