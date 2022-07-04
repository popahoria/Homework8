

package com.fasttrack.Exercise4;

public class Student{
    private String name;
    private int grade;

    static int studentNr;
    static int gradeSum;


    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        studentNr += 1;
        gradeSum += grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    static double averageGrade() {
        return (double) gradeSum / (double) studentNr;
    }
}
