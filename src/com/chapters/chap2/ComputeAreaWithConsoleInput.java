package com.chapters.chap2;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Declare and Initialize Constant PI
        final double PI = 3.14159;
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the  user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * PI;

        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
