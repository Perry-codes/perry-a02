/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Computing Simple Interest

propmt for principle amount
principle = nextDouble();
Propmt for the rate of interest
interest = nextDouble();
Prompt for number of years
years = nextInt()
Calculate accrued total
output

interest formula A = P(1 + rt)


 */

package exercise12;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution12 {
    private static final Scanner sc = new Scanner(System.in);
    static double startAmount;
    static double interestRate;
    static int yearsInvested;
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

        finishAmount = Math.ceil(startAmount*(1 + interestRate * yearsInvested)*100)/100;

        System.out.printf("After %d years at %.2f%s, the investment will be worth %s",yearsInvested,interestRate*100,"%",dollarFormat.format(finishAmount));
    }

    private static void setYears() {
        System.out.println("Enter the number of years: ");
        yearsInvested = sc.nextInt();
    }

    private static void setInterestRate(double interest) {
        interestRate = interest / 100;
    }
}
