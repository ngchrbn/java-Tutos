package com.case_study;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to find its factorial: ");
        int n = input.nextInt();
        System.out.println(n + "! is \n" + factorial(n));
        String str = new String(new char[]{'J', 'a', 'v', 'a'});
        String str1 = String.valueOf(new char[]{'J', 'a', 'v', 'a'});


    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=n; i++)
            result = result.multiply(new BigInteger(i + ""));

        return result;
    }
}
