package org.example.Task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> initialGrades = List.of(5.0, 4.0, 4.5);
        Student student = new Student("A23I32", initialGrades);

        System.out.println(student);

        student.addGrade(3.0);
        student.addGrade(5.0);


        System.out.println("New " + student);
    }
}