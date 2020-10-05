package com.Exercises.StringsAndChars;

import java.util.Scanner;

/**
 * Exercise 4-23 of the chapter 4
 * Includes: Formatting output
 */
public class Exercise4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the Employee for Name
        System.out.print("Enter employee's name: ");
        String employee_name = input.nextLine();

        // Prompt for the number of hours worked in a week
        System.out.print("Enter the number of hours worked in a week: ");
        int number_of_hours = input.nextInt();

        // Prompt for hourly pay rate
        System.out.print("Enter hourly pay rate: ");
        double hourly_pay_rate = input.nextDouble();

        // Prompt for federal tax withholding rate
        System.out.print("Enter federal tax withholding rate: ");
        double federal_tax_rate = input.nextDouble();

        // Prompt for state tax withholding rate
        System.out.print("Enter state tax withholding rate: ");
        double state_tax_rate = input.nextDouble();

        // Calculate gross Pay
        double gross_pay = number_of_hours * hourly_pay_rate;

        // Calculate federal withholding
        double federal_withholding = gross_pay * federal_tax_rate;

        // Calculate state withholding
        double state_withholding = gross_pay * state_tax_rate;

        // Calculate total reduction
        double total_reduction = federal_withholding + state_withholding;

        // Print out the employee's information
        System.out.printf("Employee Name: %s", employee_name);
        System.out.printf("\nHours Worked: %.1f", (float)number_of_hours);
        System.out.printf("\nPay Rate: $%.2f", hourly_pay_rate);
        System.out.printf("\nGross Pay: $%.1f", (gross_pay));
        System.out.println("\nDeductions:");
        System.out.printf("\tFederal Withholding (%.1f%%): $%.1f",(federal_tax_rate * 100), federal_withholding);
        System.out.printf("\n\tState withholding (%.1f%%): $%.2f", (state_tax_rate * 100), state_withholding);
        System.out.printf("\n\tTotal Reduction: $%.2f", total_reduction);
        System.out.printf("\nNet Pay: $%.2f", (gross_pay - total_reduction));

    }
}
