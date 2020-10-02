package com.chapters.chap12;

import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception{
        // Create a File instance
        File file = new File("scores.txt");

        // Create s Scanner for the file
        Scanner input = new Scanner(file);

        if (!file.exists()) {
            System.out.println("File doesn't exist");
            System.exit(1);
        }

        // Read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(
                    firstName + " " + mi + " " + lastName + " " + score
            );
        }
        // CLose the file
        input.close();
    }
}
