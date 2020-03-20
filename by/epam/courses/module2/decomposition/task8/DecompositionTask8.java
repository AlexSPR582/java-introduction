package by.epam.courses.module2.decomposition.task8;

public class DecompositionTask8 {
    public int sumThreeElement(int startIndex, int[] array){
        int endIndex = startIndex + 2;
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++){
            sum += array[i];
        }
        return sum;
    }
}
