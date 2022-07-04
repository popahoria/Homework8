package com.fasttrack.Exercise4;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Horia", 7);
        Student student2 = new Student("Adi", 9);
        Student student3 = new Student("Marius", 9);
        Student student4 = new Student("Bogdan", 8);
        System.out.println("The average grade of the students is: " + Student.averageGrade());
    }
}
