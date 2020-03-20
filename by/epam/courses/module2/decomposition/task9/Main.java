package by.epam.courses.module2.decomposition.task9;

//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
//Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

public class Main {
    public static void main(String[] args) {
        DecompositionTask9 task9 = new DecompositionTask9();
        System.out.println("Плозадь четырёхугольника: "
                + task9.findQuadrangleArea(5, 7, 8, 3));
    }
}
