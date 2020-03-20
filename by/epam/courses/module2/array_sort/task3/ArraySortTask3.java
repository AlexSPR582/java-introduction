package by.epam.courses.module2.array_sort.task3;

public class ArraySortTask3 {
    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++){
            int indMax = i;
            for (int j = i; j < array.length; j++){
                if (array[j] > array[indMax]){
                    indMax = j;
                }
            }
            int buffer = array[i];
            array[i] = array[indMax];
            array[indMax] = buffer;
        }
        return array;
    }
}
