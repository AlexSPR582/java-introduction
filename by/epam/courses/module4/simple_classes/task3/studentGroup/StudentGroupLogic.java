package by.epam.courses.module4.simple_classes.task3.studentGroup;

import by.epam.courses.module4.simple_classes.task3.student.Student;
import by.epam.courses.module4.simple_classes.task3.student.StudentLogic;

public class StudentGroupLogic {
    public void printExcellentStudents(StudentGroup students) {
        StudentLogic sl = new StudentLogic();
        for (Student student: students.getStudents()) {
            if (sl.isStudentExcellent(student)) {
                System.out.println(student.getName() + ", " + student.getGroup());
            }
        }
    }
}
