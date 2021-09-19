/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Currency Conversion

prompt user for euro amount
c_from = nextDouble()
prompt user for exchange rate
rate = nextDouble()
convert to dollar
    round up to penny

 */

package exercise11;

import java.util.Scanner;

public class Solution11 {
    private static final Scanner sc = new Scanner(System.in);
    static double euros;
    static double exchangeRate;
    static double dollars;

    public static void main(String[] args) {
        System.out.println("How many euros are you exchanging?");
        euros = sc.nextDouble();
        System.out.println("What is the exchange rate?");
        exchangeRate = sc.nextDouble();
        output();
    }

    private static void output() {
        dollars = Math.ceil(euros * exchangeRate*100) / 100;
        System.out.printf("%.2f euros at the exchange rate of %.5f is%n" +
                "%.2f U.S. dollars.",euros,exchangeRate,dollars);
    }
}
