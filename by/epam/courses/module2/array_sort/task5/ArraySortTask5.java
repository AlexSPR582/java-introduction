package by.epam.courses.module2.array_sort.task5;

public class ArraySortTask5 {
    public int[] insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int value = array[i];
            int index = binarySearch(0, j, array, array[i]);
            if (index >= 0) {
                while (j >= index) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[index] = value;
            }
        }
        return array;
    }

    private static int binarySearch(int leftInd, int rightInd, int[] array, int number) {
        if (rightInd == leftInd){
            if (number < array[rightInd]){
                return rightInd;
            }
        }
        else if (leftInd < rightInd){
            int middle = 1 + (rightInd + leftInd) / 2;
            if (number <= array[middle] && number >= array[middle - 1]){
                return middle;
            }
            else if (number < array[middle]){
                rightInd = middle - 1;
                return binarySearch(leftInd, rightInd, array, number);
            }
            else {
                leftInd = middle + 1;
                return binarySearch(leftInd, rightInd, array, number);
            }
        }
        return -1;
    }
}






