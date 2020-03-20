package by.epam.courses.module2.decomposition.task7;

public class DecompositionTask7 {
    public int sumFactorial(){
        int sum = 0;
        for (int i = 1; i < 10; i++){
            if (i % 2 != 0){
                sum += findFactorial(i);
            }
        }
        return sum;
    }

    public int findFactorial(int number){
        int fact = number;
        for (int i = 1; i < number; i++){
            fact *= i;
        }
        return fact;
    }
}
