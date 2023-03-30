package repository;

import java.util.ArrayList;
import java.util.List;

import models.Student;

public class StudentRepository {

    public static List<Student> getAll() {
        
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Mario", 12, 14.5, "A"));
        students.add(new Student(2, "Ana", 15, 16.2, "B"));
        students.add(new Student(3, "Carlos", 13, 13.8, "A"));
        students.add(new Student(4, "Luisa", 14, 15.6, "C"));
        students.add(new Student(5, "Javier", 15, 14.7, "B"));
        students.add(new Student(6, "María", 12, 15.9, "C"));
        students.add(new Student(7, "Pedro", 13, 12.3, "A"));
        students.add(new Student(8, "Carmen", 14, 17.1, "B"));
        students.add(new Student(9, "Juan", 15, 14.8, "C"));
        students.add(new Student(10, "Marta", 12, 16.5, "A"));
        students.add(new Student(11, "Alejandro", 13, 13.4, "B"));
        students.add(new Student(12, "Sara", 14, 15.3, "C"));
        students.add(new Student(13, "Diego", 15, 16.8, "A"));
        students.add(new Student(14, "Laura", 12, 14.6, "B"));
        students.add(new Student(15, "Jorge", 13, 12.9, "C"));

        return students;
    }

}
