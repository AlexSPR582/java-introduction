package by.epam.courses.module2.decomposition.task1;

public class DecompositionTask1 {
    public int findNod(int a, int b){
        int nod = 0;
        if (a <= b){
            nod = a;
        }
        else {
            nod = b;
        }
        while (nod > 0){
            if (a % nod == 0 && b % nod == 0){
                break;
            }
            else {
                nod = nod - 1;
            }
        }
        return nod;
    }

    public int findNok(int a, int b){
        int nok = (a * b) / findNod(a, b);
        return nok;
    }
}
