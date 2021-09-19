/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Numbers to Names

prompt input from user
numberMonth = nextInt

switch case to set nameMonth

 */

package exercise21;

import java.util.Scanner;

public class Solution21 {
    private static final Scanner sc = new Scanner(System.in);
    static int numberMonth;
    static String monthString;

    public static void main(String[] args) {
        System.out.println("Please enter the number of the month: ");
        numberMonth = sc.nextInt();

        getNameMonth(numberMonth);

        System.out.printf("The name of the month is %s.",monthString);
    }

    private static void getNameMonth(int numberMonth) {
        switch (numberMonth) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
    }
}
