package by.epam.courses.module4.simple_classes.task3.studentGroup;

import by.epam.courses.module4.simple_classes.task3.student.Student;

import java.util.Arrays;

public class StudentGroup {
    private Student[] students;

    public StudentGroup(Student... students){
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGroup that = (StudentGroup) o;
        return Arrays.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }
}
