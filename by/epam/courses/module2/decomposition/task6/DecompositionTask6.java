package by.epam.courses.module2.decomposition.task6;

public class DecompositionTask6 {
    public boolean isSimpleNumbers(int a, int b, int c){
        int nod = findNod(a, b, c);
        if (nod > 1){
            return false;
        }
        return true;
    }

    private int findNod(int a, int b, int c){
        int nod = 1;
        for (int i = 2; i <= a; i++){
            if (a % i == 0 & b % i == 0 & c % i == 0){
                nod = i;
            }
        }
        return nod;
    }
}
