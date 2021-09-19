/* UCF COP3330 Fall 2021 Assignment 2 Solution
        * Copyright 2021 Maggie Perry
        */
/*
Multi-state Sales Tax Calc

prompt for order amount
orderAmount = nextDouble

Propmpt user for state
if state.equals("Wisconsin")
prompt user for county
Add tax for Eau Claire and Dunn co

calculate tax

calculate total

 */
package exercise20;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution20 {
    private static final Scanner sc = new Scanner(System.in);
    static double orderAmount;
    static double taxRate;
    static double orderTotal;

    public static void main(String[] args) {
        System.out.print("What is the order amount?");
        orderAmount = sc.nextDouble();
        //setOrderAmount();
        setTaxRate();
        output();
    }

    private static void output() {
        Locale usa = new Locale("en", "US");

        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
        double tax = taxRate * orderAmount;
        orderTotal = Math.ceil((tax + orderAmount)*100) / 100;
        System.out.printf("The tax is %s.%nThe total is %s.",dollarFormat.format(tax),dollarFormat.format(orderAmount));

        }


    private static void setTaxRate() {
        System.out.print("What state do you live in?");
        String state;
        state = sc.nextLine();
        if(state.equals("Wisconsin")) {
            taxRate += 0.05;
            promptCountyCheck();
        } else if(state.equals("Illinois")) {
            taxRate = 0.08;
        } else taxRate = 0;

    }

    private static void promptCountyCheck() {
        System.out.print("What county to you live in?");
        String county = sc.nextLine();
        if(county.equals("Eau Claire")) taxRate += 0.005;
        if(county.equals("Dunn")) taxRate +=0.004;

    }

    private static void setOrderAmount(double nextDouble) {
        orderAmount = Math.ceil(nextDouble * 100) /100;
    }
}
