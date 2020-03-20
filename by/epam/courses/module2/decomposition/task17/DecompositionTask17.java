package by.epam.courses.module2.decomposition.task17;

public class DecompositionTask17 {
    public int countOperations(int number){
        int operations = 0;
        while (number > 0){
            number -= sum(number);
            operations += 1;
        }
        return operations;
    }

    private int sum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
