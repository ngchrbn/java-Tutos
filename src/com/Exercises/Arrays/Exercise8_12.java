package com.Exercises.Arrays;

import java.util.Scanner;

public class Exercise8_12 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Rates: same for all filing statuses
        double[] rates = {0.10, 0.15, .25, .28, .33, .35};

        // brackets for each rate for all filing statuses
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},   // Single filer
                {16700, 67900, 137050, 20885, 372950},  // Married jointly
                                                        // or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},   // Married separately
                {11950, 45500, 117450, 190200, 372950}  // Head of household
        };
        // Prompt the user to enter filling status
        System.out.print("0-single filer, \n1-married jointly or " +
                "qualifying widow(er), \n2-married separately, \n3-head of " +
                "household \nEnter the filing status: ");

        int status = getStatus();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Display the result
        System.out.printf("Tax is $%6.2f\n", computeTax(brackets, rates, status
        , income));
    }

    /** computeTax computes and returns the total
     tax for the filing status brackets */
    public static double computeTax(int[][] brackets, double[] rates,
                                    int status, double income) {
        double tax = 0, incomeTaxed = 0;
        for (int i = 4; i >= 0; i--) {
            if (income > brackets[status][i])
                tax += (incomeTaxed = income - brackets[status][i]) * rates[i + 1];
            income -= incomeTaxed;
        }
        return tax + brackets[status][0] * rates[0];
    }

    /** getStatus returns a valid status */
    public static int getStatus(){
        Scanner input = new Scanner(System.in);
        int status;
        do {
            status = input.nextInt();
            if (status < 0 || status > 3)
                System.out.println("Error: invalid status");
        } while (status < 0 || status > 3);
        return status;
    }
}
