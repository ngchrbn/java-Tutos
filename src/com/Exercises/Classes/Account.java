package com.Exercises.Classes;

import java.util.Date;

public class Account {
    private int id; // for the account
    private double balance; // for the account
    private static double annualInterestRate = 0;  // Store the current interest rate
    private final Date dateCreated;

    /** Create an account with id and balance equal to zero */
    public Account() {
        this(0, 0);
    }

    /** Creates an account with the specified id and initial balance */
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    /** Return the id */
    public int getId() {
        return id;
    }

    /** Set a new id */
    public void setId(int id) {
        this.id = id;
    }

    /** Return the balance */
    public double getBalance() {
        return balance;
    }

    /** Set a new balance */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** Get the annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate / 100;
    }

    /** Get dateCreated */
    public Date getDateCreated() {
        return dateCreated;
    }

    /** Get monthly interest rate */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /** Get monthly interest */
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    /** Withdraws a specified amount from the account */
    public void withdraw(double balance) {
        if (getBalance() < balance) {
            System.out.println("Unfortunately, You don't have that amount in you account");
            return;
        }
        setBalance(getBalance() - balance);
        System.out.println(balance + " has been withdrawn from you account");
    }

    /** Deposits a specified amount to the account */
    public void deposit(double balance) {
        setBalance(getBalance()+balance);
        System.out.println(balance + " has been deposited to your account");
    }
}
