package com.Chapters.chap2;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        final double PI = 3.14159;
        // Assign a radius
        radius = 20;

        // Compute area
        area = radius  * radius * PI;

        // Display results
        System.out.println("The area for the circle of radius " + radius
        + " is " + area);
    }
}
