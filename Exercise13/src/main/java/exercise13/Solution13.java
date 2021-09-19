/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Determining Compound Interest

Prompt for starting amount
startingAmount = nextDouble()
prompt for interest rate
rate = nextDouble()
prompt for number of years
years = nextInt()
Prompt for number of times compounded
compoundsPerYear = nextInt()

Calculate and output
A = P(1 + r/n)^(n*t)
 */

package exercise13;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution13 {
    private static final Scanner sc = new Scanner(System.in);
    static double startAmount;
    static double interestRate;
    static int yearsInvested;
    static int yearlyCompounds;
    static double finishAmount;

    public static void main(String[] args) {
        System.out.println("Enter the principal: ");
        startAmount = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double interest = sc.nextDouble();
        setInterestRate(interest);

        setYears();
        output();
    }

    private static void output() {
        Locale usa = new Locale("en", "US");

        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

        finishAmount = startAmount * Math.pow(1 + interestRate / yearlyCompounds, yearlyCompounds * yearsInvested);

        finishAmount = Math.ceil(finishAmount*100)/100;

        System.out.printf("After %d years at %.2f%s, the investment will be worth %s",yearsInvested,interestRate*100,"%",dollarFormat.format(finishAmount));
    }

    private static void setYears() {
        System.out.println("Enter the number of years: ");
        yearsInvested = sc.nextInt();
        System.out.println("What is the number of times the interest is compounded per year?");
        yearlyCompounds = sc.nextInt();
    }

    private static void setInterestRate(double interest) {

        interestRate = interest / 100;
    }
}



