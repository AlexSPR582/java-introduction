package by.epam.courses.module2.array_sort.task7;

public class ArraySortTask7 {
    public int[] getInsertIndex(int[] array1, int[] array2){
        int[] result = new int[array2.length];
        int insertInd = 0;
        int indArr1 = 0;
        int indArr2 = 0;
        while (indArr2 < array2.length) {
            if (indArr1 >= array1.length) {
                result[indArr2] = insertInd;
                indArr2++;
            }
            else if (array2[indArr2] <= array1[indArr1]) {
                result[indArr2] = insertInd;
                indArr2++;
            }
            else if (array2[indArr2] > array1[indArr1]) {
                indArr1++;
            }
            insertInd++;
        }
        return result;
    }

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
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
