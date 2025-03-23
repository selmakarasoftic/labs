package org.example.Task4;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private List<Double> grades;

    public Student(String studentID, List<Double> grades) {
        this.studentID = studentID;
        this.grades = new ArrayList<>(grades);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
    }

    public List<Double> getGrades() {
        return new ArrayList<>(grades); // Return a copy to maintain encapsulation
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Grades: " + grades;
    }
}
