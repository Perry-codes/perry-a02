/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Tax Calculator

prompt for order amount
orderAmount = nextDouble()
prompt for state
state = nextLine()

if state = "WI"
    add tax at 5.5%

Output total

 */

package exercise14;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution14 {
    private static final Scanner sc = new Scanner(System.in);
    static double orderAmount;
    static String state;
    static double tax;
    static double orderTotal;

    public static void main(String[] args) {

        System.out.println("What is the order amount?");
        String orderAmt = sc.nextLine();
        orderAmount = Math.ceil( Double.parseDouble(orderAmt) * 100) / 100;
        System.out.println("What is the state?");
        state = sc.nextLine();
        setTax(state);
        returnOrderTotal();


    }

    private static void returnOrderTotal() {
        Locale usa = new Locale("en", "US");

        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
        System.out.printf("The subtotal is %s.%n",dollarFormat.format(orderAmount));
        if(tax != 0){
            System.out.printf("The tax is %s.%n",dollarFormat.format(tax));

        }
        orderTotal = orderAmount + tax;
        System.out.printf("The total is: %s.%n",dollarFormat.format(orderTotal));
    }

    private static void setTax(String state) {
        if (state.equals("WI")) tax = Math.ceil(orderAmount * 5.5) / 100;
        else tax = 0;
    }
}
