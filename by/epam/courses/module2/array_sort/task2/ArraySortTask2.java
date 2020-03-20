package by.epam.courses.module2.array_sort.task2;

public class ArraySortTask2 {
    public int[] combineArrays(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] resultArray = new int[length];
        sort(array1);
        sort(array2);
        int firstInd = 0;
        int secondInd = 0;
        for (int i = 0; i < length; i++) {
            if (secondInd == array2.length) {
                resultArray[i] = array1[firstInd];
                firstInd++;
            }
            else if (firstInd == array1.length) {
                resultArray[i] = array2[secondInd];
                secondInd++;
            }
            else if (array1[firstInd] < array2[secondInd]) {
                resultArray[i] = array1[firstInd];
                firstInd++;
            }
            else {
                resultArray[i] = array2[secondInd];
                secondInd++;
            }
        }
        return resultArray;
    }

    private int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int buffer = array[i];
                    array[i] = array[j];
                    array[j] = buffer;
                }
            }
        }
        return array;
    }
}
