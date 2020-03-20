package by.epam.courses.module2.array_sort.task1;

public class ArraySortTask1 {
    public int[] insertArray(int k, int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] resultArray = new int[length];
        int firstArrIndex = 0;
        int secondArrIndex = 0;
        int thirdArrIndex = 0;
        while (thirdArrIndex < length) {
            if (thirdArrIndex > k && secondArrIndex < array2.length) {
                resultArray[thirdArrIndex] = array2[secondArrIndex];
                secondArrIndex++;
                thirdArrIndex++;
            }
            else {
                resultArray[thirdArrIndex] = array1[firstArrIndex];
                firstArrIndex++;
                thirdArrIndex++;
            }
        }
        return resultArray;
    }
}
