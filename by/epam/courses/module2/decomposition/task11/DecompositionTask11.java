package by.epam.courses.module2.decomposition.task11;

public class DecompositionTask11 {
    public int longerNumber(int number1, int number2){
        int size1 = sizeNumber(number1);
        int size2 = sizeNumber(number2);
        if (size1 > size2) {
            return 1;
        }
        else if (size1 < size2) {
            return -1;
        }
        else {
            return 0;
        }
    }

    private int sizeNumber(int number){
        int size = 1;
        while (number > 9) {
            size++;
            number = number / 10;
        }
        return size;
    }
}
