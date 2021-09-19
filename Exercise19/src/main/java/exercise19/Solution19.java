/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
BMI Calculator

set height
Prompt user for height in inches
while next not double, keep assking
height = nextDouble

set weight
Prompt user for weight in pounds
while next not double, keep assking
weight = nextDouble

Calculate BMI
BMI = Weight / (height * height) * 703

output range classification
 */

package exercise19;

import java.util.Scanner;

public class Solution19 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        calculateBMI(setWeight(),setHeight());
    }

    private static void calculateBMI(double weight,double height){
        double bmi = (weight / (height * height))*703;
        System.out.printf("Your BMI is %.2f%n",bmi);
        if(bmi<18.5) System.out.println("You are underweight. You should see your doctor.");
        else if(bmi>25) System.out.println("You are overweight. You should see your doctor.");
        else System.out.println("You are within the ideal weight range.");
    }

    private static double setWeight(){
        double weight;
        do {
            System.out.println("Please enter your weight in pounds.");
            while (!sc.hasNextDouble()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            weight = sc.nextDouble();
        } while (weight < 0);

        return weight;
    }

    private static double setHeight(){
        double height;
        do {
            System.out.println("Please enter your height in inches.");
            while (!sc.hasNextDouble()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            height = sc.nextDouble();
        } while (height < 0);

        return height;
    }
}
