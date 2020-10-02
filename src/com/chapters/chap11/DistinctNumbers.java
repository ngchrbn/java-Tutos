package com.chapters.chap11;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();
            if (!list.contains(value) && value!= 0)
                list.add(value);  // Add the value if it is not in the list
        } while ( value != 0);

        // Display the distinct numbers
        for (Integer integer : list)
            System.out.print(integer + " ");
    }
}
