/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Pizza Party

Prompt user for number of people
numPeople = sc.nextint()
Prompt user for number of pizzas
numPizzas = sc.nextint()
prompt user for number of slices
numSlices = sc.nextInt()

 */

package exercise08;

import java.util.Scanner;

public class Solution08 {  
    private static final Scanner sc = new Scanner(System.in);
    private static int numPeople;
    private static int numPizzas;
    private static int numSlices;
    static int totalSlices;

    public static void main(String[] args) {
        
        setPeople();
        setPizzas();
        setSlices();
        setTotalSlices(numPizzas,numSlices);
        getRecap();
        System.out.printf("Each person get %d slices of pizza.%n" +
                "There are %d leftover slices.",totalSlices / numPeople,totalSlices % numPeople);
    }

    private static void setTotalSlices(int numPizzas, int numSlices) {
        totalSlices = numSlices * numPizzas;
        //System.out.printf("Total Slices: %d%n",totalSlices);
    }
    private static void getRecap() {
        System.out.printf("%d people with %d pizzas (%d slices)%n",numPeople,numPizzas,totalSlices);
    }

    private static void setSlices() {
        System.out.println("How many slices per pizza?");
        numSlices = sc.nextInt();
    }

    private static void setPizzas() {
        System.out.println("How many pizzas?");
        numPizzas = sc.nextInt();
    }

    private static void setPeople() {
        System.out.println("How many people?");
        numPeople = sc.nextInt();
    }
}
