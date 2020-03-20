package by.epam.courses.module2.array.task7;

// 7. Даны действительные числа a a an. Найти
// max(a1 + a2n, a2 + a2n−1, ..., an + an+1)

public class Main {
    public static void main(String[] args) {
        ArrayTask7 task7 = new ArrayTask7();
        int[] array = {5, 6, 3, 1};
        System.out.println(task7.changeArrayAndFindMax(array));
    }
}
