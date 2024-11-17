package src.main.java.org.example.week4.task4;

import src.main.java.org.example.week4.people.Student;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ExtendedStudent{
    private String student_id;
    private List<Double> grades;

    public ExtendedStudent(String student_id, List<Double> grades) {
        this.student_id = student_id;
        this.grades = new ArrayList<>(grades);
    }
    public String getStudent_id() {
        return student_id;
    }
    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    public List<Double> getGrades() {
        return grades;
    }
    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + student_id + ", Grades: " + grades;
    }

}
