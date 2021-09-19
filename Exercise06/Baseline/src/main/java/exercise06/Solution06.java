/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Retirement Calculator
set to accept user input
prompt user for current age
save current age to int currentAge
prompt user for retirement age
save retirement age to int retireAge
push ages to calculator
calculate years till retirement
    retireAge - currentAge
calculate year of retirement
    get current year from system time

 */

package exercise06;

import java.time.YearMonth;
import java.util.Scanner;

public class Solution06 {

    private static final Scanner sc = new Scanner(System.in);

    static int currentAge;
    static int retirementAge;
    static int currentYear = YearMonth.now().getYear();


    public static void main(String[] args) {

        setAge();

        setRetirementAge();

        yearsTillRetire(currentAge,retirementAge);


    }

    public static void yearsTillRetire(int currentAge, int retirementAge) {

        int years = retirementAge - currentAge;
        System.out.printf("You have %d years till retirement.%n", years);
        System.out.printf("You can retire in year %d.",currentYear + years);

    }

    public static void setAge(){

        System.out.println("What is your current age? ");

        currentAge = sc.nextInt();
    }

    public static void setRetirementAge() {

        System.out.println("What age would you like to retire? ");

        retirementAge = sc.nextInt();
    }


}
