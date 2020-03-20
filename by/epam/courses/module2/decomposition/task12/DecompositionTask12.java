package by.epam.courses.module2.decomposition.task12;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class DecompositionTask12 {
    public int[] createResultArray(int k, int n){
        int[] result = new int[0];
        ArrayLogic arrLog = ArrayLogic.getInstance();
        for (int i = 1; i < n; i++){
            if (sumNumber(i) == k){
                result = arrLog.addNewElement(i, result);
            }
        }
        return result;
    }

    private int sumNumber(int number){
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
