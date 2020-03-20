package by.epam.courses.module2.decomposition.task3;

//3. Вычислить площадь правильного шестиугольника со стороной а,
//используя метод вычисления площади треугольника.

public class Main {
    public static void main(String[] args) {
        DecompositionTask3 task3 = new DecompositionTask3();
        System.out.println("Площадь шестиугольника: " + task3.findHexagonArea(5));
    }
}
