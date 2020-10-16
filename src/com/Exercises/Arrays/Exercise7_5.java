package com.Exercises.Arrays;

import java.util.Scanner;

/**
 * A program that reads ten integers, and then displays
 * the number of even and odd numbers.
 * ==> The input ends with 0.
 * ==> Sample: 1 2 3 2 6 3 4 5 2 3 6 8 9 9 0
 * ==> The number of odd numbers: 8
 * ==> The number of even numbers: 7
 */
public class Exercise7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[15];
        int even;
        int odd = even =0;
        System.out.print("Enter numbers(10): ");
        int number;

        for (int i=0; i<15; i++) {
            number = input.nextInt();
            if (number == 0)
                break;
            numbers[i] = number;
            if (number % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("The number of odd numbers: " + odd);
        System.out.println("The number of even numbers: " + even);
    }
}
