package by.epam.courses.module1.line_program.task6;

//6. Для данной области составить линейную программу, которая печатает true,
//   если точка с координатами (х, у)
//   принадлежит закрашенной области, и false — в противном случае:

public class Main {
    public static void main(String[] args) {
        LineProgram6 task6 = new LineProgram6();
        task6.isPointBelongsArea(0, -1);
        task6.isPointBelongsArea(2, -1);
        task6.isPointBelongsArea(3, 2);
    }
}
