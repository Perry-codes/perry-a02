/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Blood Alcohol Calc

Prompt for weight
weight = next double
prompt for gender (1 male,2 female)
gender = nextInt
Prompt for alcohol in oz
alcohol = nextInt
prompt for time since last
timeLast = nextDouble

Calculate BAC
    BAC = A * 5.14 / w * r   -  0.015 * H

 */

package exercise17;


import java.util.Scanner;

public class Solution17 {
    private static final Scanner sc = new Scanner(System.in);
    static double weight;
    static double distributionRatio;
    static int alcoholConsumed;
    static double hoursSinceLastDrink;
    static double bloodAlcoholLevel;

    public static void main(String[] args) {

        System.out.println("What is your gender(1 for male;2 for female)");
        distributionRatio = (sc.nextInt() == 1 ? 0.73 : 0.66);

        System.out.println("How many ounces of alcohol did you have?");
        alcoholConsumed = sc.nextInt();

        System.out.println("What is your weight, in pounds?");
        weight = sc.nextDouble();

        System.out.println("How many hours since your last drink?");
        hoursSinceLastDrink = sc.nextDouble();

        calculateBloodAlcohol();
        output();
    }

    private static void output() {
        System.out.printf("Your BAC is %.6f%n",bloodAlcoholLevel);
        String output = (bloodAlcoholLevel>0.08 ? "It is not legal to drive." : "It is legal to drive.");
        System.out.println(output);
    }

    private static void calculateBloodAlcohol() {
        bloodAlcoholLevel = (alcoholConsumed * 5.14 / weight * distributionRatio) - (0.015 * hoursSinceLastDrink);
    }
}
