package by.epam.courses.module2.array.task6;

public class ArrayTask6 {
    public double countSumSimpleIndexElement(double[] numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            if (isSimpleNumber(i + 1)){
                sum += numbers[i];
            }
        }
        return sum;
    }

    private boolean isSimpleNumber(int number){
        if (number <= 1){
            return false;
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
