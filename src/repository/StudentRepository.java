package repository;
import java.util.ArrayList;
import java.util.List;

import models.Student;

public class StudentRepository {

    public static List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Mario"));
        students.add(new Student(1, "Sofia"));
        students.add(new Student(1, "Hernan"));
        students.add(new Student(1, "Pedro"));
        students.add(new Student(1, "Oscar"));
        students.add(new Student(1, "Gabriel"));
        students.add(new Student(1, "Daniela"));
        students.add(new Student(1, "Pamela"));
        students.add(new Student(1, "Carlos"));
        return students;
    }

}
