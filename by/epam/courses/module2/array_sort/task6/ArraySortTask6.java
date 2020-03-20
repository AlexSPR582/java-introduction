package by.epam.courses.module2.array_sort.task6;

public class ArraySortTask6 {
    public double[] shellSort(double[] array){
        int i = 0;
        while (i < array.length - 1){
            if (array[i] <= array[i + 1]){
                i++;
            }
            else if (array[i] > array[i + 1] && i > 0){
                double buffer = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buffer;
                i--;
            }
            else {
                double buffer = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buffer;
            }
        }
        return array;
    }
}
