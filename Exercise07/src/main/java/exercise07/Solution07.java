package exercise07;
/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Area of Rect Room
set conversion constant 0.09290304 * ft to meters
prompt user for length of room(ft.)
roomLength = sc.nextInt();
prompt user for room width(ft.)
roomWidth = sc.nextInt();

return dimensions entered
calculate are in sq ft
calculate area in sq meters

 */

import java.util.Scanner;

public class Solution07 {
    private static final Scanner sc = new Scanner(System.in);
    private static final double feetToMeters = 0.09290304;
    static int roomLength;
    static int roomWidth;
    static int squareFeet;
    static double squareMeters;

    public static void main(String[] args) {

        System.out.println("What is the length of the room in feet?");
        roomLength = sc.nextInt();
        System.out.println("What is the width of the room in feet?");
        roomWidth = sc.nextInt();
        calculateSquareFeet();
        calculateSquareMeters();
        System.out.printf("The area is:%n%d square feet%n%f square meters",squareFeet,squareMeters);
    }

    private static void calculateSquareMeters() {
        squareFeet = roomLength * roomWidth;
    }

    private static void calculateSquareFeet() {
        squareMeters = roomLength * roomWidth * feetToMeters;
    }
}
