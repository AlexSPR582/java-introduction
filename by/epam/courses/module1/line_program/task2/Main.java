package by.epam.courses.module1.line_program.task2;

//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//   (b + (b ^ 2 + 4 * a * c) ^ 0.5) / (2 * a) + a ^ 3 * c + b ^ (-2)

public class Main {
    public static void main(String[] args) {
        LineProgram2 task2 = new LineProgram2();
        System.out.println(task2.calculate(5, 3, 6));
    }
}
