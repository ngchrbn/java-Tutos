package com.case_study;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of student in course1 \" "
        + course1.getCourseName() + "  \" is " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i=0; i<course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();

        System.out.println("Number of student in course2 \" "
                + course2.getCourseName() + " \" is " + course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (int i=0; i<course2.getNumberOfStudents(); i++)
            System.out.print(students2[i] + ", ");
    }
}
