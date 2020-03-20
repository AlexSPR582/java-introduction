package by.epam.courses.module4.simple_classes.task3.main;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

import by.epam.courses.module4.simple_classes.task3.studentGroup.StudentGroup;
import by.epam.courses.module4.simple_classes.task3.studentGroup.StudentGroupLogic;
import by.epam.courses.module4.simple_classes.task3.student.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Спиридонов А.Г.", "A123", 5, 8, 7, 6, 9);
        Student student2 = new Student("Соловьёв В.А.", "F432", 10, 9, 9, 10, 9);
        Student student3 = new Student("Кузнецов Д.В.", "S871", 2, 3, 7, 6, 6);
        Student student4 = new Student("Петров П.Г.", "A123", 9, 8, 7, 6, 9);
        Student student5 = new Student("Карпов Э.М.", "F432", 10, 10, 10, 10, 10);
        Student student6 = new Student("Прокопенко Ю.А.", "F432", 4, 8, 9, 9, 9);
        Student student7 = new Student("Романов Р.Е.", "A123", 6, 8, 7, 6, 9);
        Student student8 = new Student("Волков А.А.", "S871", 7, 7, 8, 6, 9);
        Student student9 = new Student("Захарченко З.И.", "A123", 9, 10, 10, 9, 9);
        Student student10 = new Student("Цветков П.В.", "S871", 8, 5, 4, 6, 9);
        StudentGroup group = new StudentGroup(student1, student2, student3, student4,
                student5, student6, student7, student8, student9, student10);
        StudentGroupLogic sgl = new StudentGroupLogic();
        sgl.printExcellentStudents(group);
    }
}
