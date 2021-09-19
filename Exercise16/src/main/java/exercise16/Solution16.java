/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Legal Driving Age

Prompt user for their age
age = nextInt
output
    if age >16
        You are old enough to drive
    else
        You are too young to drive

 */

package exercise16;

import java.util.Scanner;

public class Solution16 {
    private static final Scanner sc = new Scanner(System.in);
    static int age;

    public static void main(String[] args) {

        System.out.println("What is your age?");
        age = sc.nextInt();

        output();


    }

    private static void output() {
        String output = (age>15 ? "You are old enough to drive." : "Your are too young to drive");
        System.out.println(output);
    }
}
