/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Troubleshooting Car Issues

series of if statements

follow uml provided

 */

package exercise23;

import java.util.Scanner;

public class Solution23 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        if(isCarSilent()){
            if(areTerminalsCorroded()){
                System.out.println("Clean terminals and try starting again.");
            } else System.out.println("Replace cables and try again");
        }else {
            if(makingSlickingNoise()){
                System.out.println("Replace the battery.");
             } else 
    }

    private static boolean areTerminalsCorroded() {
        System.out.println("Are the battery terminals corroded?");
        return sc.nextBoolean();
    }

    private static boolean isCarSilent() {
        System.out.println("Is the car silent when you turn the key?");
        return sc.nextBoolean();
    }
}

    private static boolean makingSlickingNoise() {
        System.out.println("Does the car make a slicking noise?");
        return sc.nextBoolean();
    }


    }
