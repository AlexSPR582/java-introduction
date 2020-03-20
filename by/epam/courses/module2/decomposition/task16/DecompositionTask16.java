package by.epam.courses.module2.decomposition.task16;

import static java.lang.Math.*;

public class DecompositionTask16 {
    public int sumOnlyOddNumbers(int n) {
        int sum = 0;
        int startNumber = (int) pow(10, n - 1);
        int endNumber = (int) pow(10, n);
        for (int i = startNumber; i < endNumber; i++) {
            if (isOnlyOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public int sumEvenNumerals(int number){
        int sum = 0;
        while (number > 0) {
            int numeral = number % 10;
            if (numeral % 2 == 0) {
                sum += numeral;
            }
            number = number / 10;
        }
        return sum;
    }

    private boolean isOnlyOdd(int number){
        while (number > 0) {
            int numeral = number % 10;
            if (numeral % 2 == 0) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }
}
