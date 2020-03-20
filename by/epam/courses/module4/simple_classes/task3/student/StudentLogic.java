package by.epam.courses.module4.simple_classes.task3.student;

public class StudentLogic {
    public boolean isStudentExcellent(Student student) {
        for (int mark: student.getMarks()) {
            if (mark < 9) {
                return false;
            }
        }
        return true;
    }
}
