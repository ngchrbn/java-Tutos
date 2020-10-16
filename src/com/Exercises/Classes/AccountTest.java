package com.Exercises.Classes;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Your balance is: " + account.getBalance());
        System.out.println("The monthly interest is: " + account.getMonthlyInterest());
        System.out.println("You account was created on" + account.getDateCreated());

        System.out.println();
        Account account1 = new Account(1141, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);

        System.out.println("Your balance is: " + account1.getBalance());
        System.out.println("The monthly interest is: " + account1.getMonthlyInterest());
        System.out.println("You account was created on" + account1.getDateCreated());
    }
}
