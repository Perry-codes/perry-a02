/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Self Checkout

prompt user for item 1 price
item1Price = nextDouble()
prompt user for item 1 qty
item1Qty = nextInt()

Repeat for items 2 and 3

Add up subtotal
add tax rate
add total
return all strings

 */

package exercise10;

import java.util.Scanner;

public class Solution10 {
    private static final Scanner sc = new Scanner(System.in);
    static double[] itemPrice = new double[3];
    static int[] itemQty = new int[3];
    static double subtotal;
    static double tax;
    static double total;

    public static void main(String[] args) {
        inputItems();
        calculateSubtotal(itemPrice, itemQty);
        calculateTax();
        calculateTotal();
        output();
    }

    private static void inputItems() {
        for (int i = 0; i < 3; i++) {
            System.out.printf("Whats the price of item %d?", i + 1);
            String price = sc.nextLine();
            itemPrice[i] = Double.parseDouble(price);
            System.out.printf("Whats the quantity of item %d?", i + 1);
            String qty = sc.nextLine();
            itemQty[i] = Integer.parseInt(qty);

        }
    }

    private static void output() {
        System.out.printf("Subtotal: $%.2f%nTax: $%.2f%nTotal: $%.2f", subtotal, tax, total);
    }

    private static void calculateTotal() {
        total = subtotal + tax;
    }

    private static void calculateTax() {
        tax = subtotal * 0.055;
    }

    private static void calculateSubtotal(double[] itemPrice, int[] itemQty) {
        subtotal = itemPrice[0] * itemQty[0] + itemPrice[1] * itemQty[1] + itemPrice[2] * itemQty[2];


    }

}