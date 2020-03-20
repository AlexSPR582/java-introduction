package by.epam.courses.module2.decomposition.task5;

public class DecompositionTask5 {
    public int findSecondMax(int[] array){
        int max = findMax(array);
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < max && array[i] > secondMax){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    private int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
