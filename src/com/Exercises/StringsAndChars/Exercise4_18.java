package com.Exercises.StringsAndChars;

import java.util.Scanner;

/**
 * Exercise ==>:
 * (Student major and status) Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is number character 1, 2, 3, 4, which
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * the following characters are used to denote the majors:
 * I: Information Management
 * C: Computer Science
 * A: Accounting
 */

public class Exercise4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter two characters
        System.out.print("Enter two characters(Major, level): ");
        String answer = input.nextLine();

        // To uppercase the  first character if not capital
        char m = Character.toUpperCase(answer.charAt(0));
        // Save the second character as level
        char l = answer.charAt(1);

        // String to save the whole return statement to the user
        String student_major_status = "";
        switch (m) {
            case 'I' -> student_major_status = "Information Management ";
            case 'C' -> student_major_status = "Computer Science ";
            case 'A' -> student_major_status = "Accounting ";
            default -> {
                System.out.print("invalid input");
                System.exit(1);
            }
        }

        switch (l) {
            case '1' -> student_major_status += " Freshman";
            case '2' -> student_major_status += " Sophomore";
            case '3' -> student_major_status += "Junior";
            case '4' -> student_major_status += "Senior";
            default -> {
                System.out.print("Invalid input");
                System.exit(1);
            }
        }

        // The student will be printed only if there is o invalid input
        System.out.print(student_major_status);
    }
}
