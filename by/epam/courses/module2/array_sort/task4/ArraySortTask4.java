package by.epam.courses.module2.array_sort.task4;

public class ArraySortTask4 {
    private int permutation;

    public int[] bubbleSort(int[] array) {
        permutation = 0;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int buffer = array[i];
                    array[i] = array[j];
                    array[j] = buffer;
                    permutation++;
                }
            }
        }
        return array;
    }

    public int getPermutation() {
        return permutation;
    }
}
