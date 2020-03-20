package by.epam.courses.module2.decomposition.task13;

public class DecompositionTask13 {
    public void findTwinsSimpleNumbers(int n){
        for (int i = n; i <= 2 * n; i++){
            if (isSimpleNumber(i) && isSimpleNumber(i + 2) && i + 2 <= 2 * n){
                System.out.println(i + " " + (i + 2));
            }
        }
    }

    private boolean isSimpleNumber(int number){
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
