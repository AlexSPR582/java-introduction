package by.epam.courses.module2.decomposition.task15;

import by.epam.courses.module2.array_logic.ArrayLogic;

import static java.lang.Math.*;

public class DecompositionTask15 {
    public int[] findIncreaseNumbers(int n) {
        int[] increaseNumbers = new int[0];
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int startNumber = (int) pow(10, n - 1);
        int endNumber = (int) pow(10, n);
        for (int i = startNumber; i < endNumber; i++) {
            if (isIncreaseNumber(i)){
                increaseNumbers = arrLog.addNewElement(i, increaseNumbers);
            }
        }
        return increaseNumbers;
    }

    private boolean isIncreaseNumber(int number){
        int previousNumeral = number % 10;
        number = number / 10;
        while (number > 0) {
            if (previousNumeral - number % 10 != 1) {
                return false;
            }
            previousNumeral = number % 10;
            number = number / 10;
        }
        return true;
    }
}
