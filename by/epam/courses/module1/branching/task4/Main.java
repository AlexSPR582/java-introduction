package by.epam.courses.module1.branching.task4;

//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//   отверстие.

public class Main {
    public static void main(String[] args) {
        Brick brick = new Brick(6, 4,3);
        BranchingTask4 task4 = new BranchingTask4();
        System.out.println(task4.isBrickGoThoughtHole(5, 2, brick));
        System.out.println(task4.isBrickGoThoughtHole(5,5, brick));
    }
}
