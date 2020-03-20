package by.epam.courses.module2.decomposition.task2;

public class DecompositionTask2 {
    public int findCommonFactor(int a, int b, int c, int d){
        int min = findMin(a, b, c, d);
        int commonFactor  = 1;
        int i = 1;
        while (i <= min){
            if (a % i == 0 & b % i == 0 & c % i == 0 & d % i == 0){
                commonFactor = i;
                i++;
            }
            else {
                i++;
            }
        }
        return commonFactor;
    }

    private int findMin(int a, int b, int c, int d){
        int[] numbers = {a, b, c, d};
        int min = a;
        for (int i = 0; i < 4; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
}
