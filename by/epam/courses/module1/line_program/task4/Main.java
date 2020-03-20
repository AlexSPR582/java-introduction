package by.epam.courses.module1.line_program.task4;

//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//   дробную и целую части числа и вывести полученное значение числа.

public class Main {
    public static void main(String[] args) {
        LineProgram4 task4 = new LineProgram4();
        System.out.println(task4.swap(345.124));
    }
}
