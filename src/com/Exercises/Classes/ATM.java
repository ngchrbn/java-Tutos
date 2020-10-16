package com.Exercises.Classes;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // Initialize 10 accounts with ids from 0 to 9 and balance equals to 100
        Account[] accounts = new Account[10];
        Arrays.setAll(accounts, i -> new Account(i, 100));

        Scanner input = new Scanner(System.in);
        int id;
        do {
            System.out.print("Enter an id: ");
            id = input.nextInt();
            if (id < 0 || id >= accounts.length)
                continue;
            menu(accounts[id]);
        } while (true);
    }

    /** Main menu function */
    public static void menu(Account account) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int choice; // Menu choice
        double amount;  // Hold amount of deposit and withdraw
        do {
            System.out.println("\nMain Menu");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter a choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> System.out.printf("The balance in your account is $%.1f\n",
                        account.getBalance());
                case 2 -> {
                    System.out.print("Enter the amount to withdraw: ");
                    amount = input.nextDouble();
                    account.withdraw(amount);
                }
                case 3 -> {
                    System.out.print("Enter the amount to deposit: ");
                    amount = input.nextDouble();
                    account.deposit(amount);
                }
                case 4 -> run = false;
                default -> System.out.println("Choose between 1 - 4!!!");
            }
        } while (run);
    }
}
