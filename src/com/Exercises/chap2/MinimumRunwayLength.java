package com.Exercises.chap2;

import java.util.Scanner;

public class MinimumRunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for speed and acceleration
        System.out.println("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        // Calculate the minimum runway length
        float length = (float) (Math.pow(speed, 2) / (2 * acceleration));

        // Display the minimum runway length
        System.out.println("The minimum runway for this airplane is " + length);
    }
}
