package by.epam.courses.module2.decomposition.task14;

import static java.lang.Math.*;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class DecompositionTask14 {
    public int[] findArmstrongNumbers(int k){
        int[] armstrongNumbers = new int[0];
        ArrayLogic arrLog = ArrayLogic.getInstance();
        for (int i = 1; i <= k; i++){
            if (sum(i) == i){
                armstrongNumbers = arrLog.addNewElement(i, armstrongNumbers);
            }
        }
        return armstrongNumbers;
    }

    private int sum(int number) {
        int sum = 0;
        int size = sizeNumber(number);
        while (number > 0) {
            sum += pow(number % 10, size);
            number = number / 10;
        }
        return sum;
    }

    private int sizeNumber(int number) {
        int size = 1;
        while (number > 9) {
            size++;
            number = number / 10;
        }
        return size;
    }
}
