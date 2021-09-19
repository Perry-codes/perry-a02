/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Comparing Numbers

prompt user for 3 number

if any numbers equal
    not unique numbers

find max of numbers

return max in string

 */

package exercise22;

import java.util.Scanner;

public class Solution22 {
    private static final Scanner sc = new Scanner(System.in);
    static int[] inputNumber = new int[3];

    public static void main(String[] args) {

        inputNewNumbers();
        findMax();

    }

    private static void findMax() {
        int max=0;
        if( inputNumber[0]==inputNumber[1] || inputNumber[0] == inputNumber[2] || inputNumber[1]==inputNumber[2]){
            System.out.println("The numbers are not all unique.");
        } else if (inputNumber[0]>inputNumber[1] && inputNumber[0]>inputNumber[2]){
            max = inputNumber[0];
        } else if(inputNumber[1]>inputNumber[0] && inputNumber[1]>inputNumber[2]){
            max = inputNumber[1];
        }else max = inputNumber[2];

        if(max == 0) ;
            else System.out.printf("The largest number is %d.",max);
    }

    private static void inputNewNumbers() {
        System.out.println("Enter three unique numbers.\nEnter the first number: ");
        inputNumber[0] = sc.nextInt();

        System.out.println("Enter the second number: ");
        inputNumber[1] = sc.nextInt();

        System.out.println("Enter the third number: ");
        inputNumber[2] = sc.nextInt();



    }
}
