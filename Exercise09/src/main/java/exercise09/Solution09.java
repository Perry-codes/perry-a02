/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Paint Calculator
(use length/width functions form room calc)
prompt for the length
set length
prompt for width
set width
calculate area
calculate paint gallon
round up
 */

package exercise09;

import java.util.Scanner;

public class Solution09 {
    private static final Scanner sc = new Scanner(System.in);
    private static final int SQ_FEET_PER_GALLON = 350;
    static int roomLength;
    static int roomWidth;
    static int squareFeet;
    static int gallons;

    public static void main(String[] args) {

        System.out.println("What is the length of the room in feet?");
        roomLength = sc.nextInt();
        System.out.println("What is the width of the room in feet?");
        roomWidth = sc.nextInt();
        calculateSquareFeet();
        calculateGallons();
        System.out.printf("You will need %d gallons of paint to cover %d square feet.",(int)Math.ceil(gallons),squareFeet);
    }

    private static void calculateGallons() {
        gallons = squareFeet / SQ_FEET_PER_GALLON;
    }

   private static void calculateSquareFeet() {

        squareFeet = roomLength * roomWidth;
    }
}
