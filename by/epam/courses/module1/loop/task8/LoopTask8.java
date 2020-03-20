package by.epam.courses.module1.loop.task8;

import static java.lang.Math.*;

public class LoopTask8 {
    public void getResult(int firstNum, int secondNum){
        firstNum = deleteRepeatNumerals(firstNum);
        secondNum = deleteRepeatNumerals(secondNum);
        int size = sizeNumber(firstNum);
        while (size > 0) {
            if (contain(firstNum % 10, secondNum)) {
                System.out.print(firstNum % 10 + " ");
            }
            firstNum = firstNum / 10;
            size--;
        }
        System.out.println();
    }

    public boolean contain(int numeral, int number) {
        int sizeNumber = sizeNumber(number);
        while (sizeNumber > 0) {
            if (number % 10 == numeral) {
                return true;
            }
            number = number / 10;
            sizeNumber--;
        }
        return false;
    }

    private int sizeNumber(int number) {
        int size = 1;
        while (number > 9) {
            number /= 10;
            size++;
        }
        return size;
    }

    public int deleteRepeatNumerals(int number) {
        Integer result = null;
        int size = sizeNumber(number);
        int degree = 0;
        while (size > 0) {
            if (result == null) {
                result = number % 10;
                degree++;
            }
            else if (!contain(number % 10, result)) {
                result += (number % 10) * (int) pow(10, degree);
                degree++;
            }
            number /= 10;
            size--;
        }
        return result;
    }
}
