package by.epam.courses.module2.array.task5;

public class ArrayTask5 {
    public void printElementsBiggerThanIndex(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > i){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
