/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Temp Converter

prompt user for conversion type
convType = nextChar

if C or c rom Celsius Conversion
else run Fahrenheit Conversion

Celsius Conversion
Prompt user for Fahrenheit Temp
tempF = nextInt
 tempC = (F-32) * 5 / 9
 output

Fahrenheit Conversion
Prompt user for Celsius Temp
tempC - nextInt
tempF = (C * 9 / 5) + 32
output

 */

package exercise18;

import java.util.Scanner;

public class Solution18 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit. \nYour choice:");

        String input = sc.nextLine();
        if("C".equalsIgnoreCase(input)) convertCelsius();
        else  convertFahrenheit();
    }

    private static void convertFahrenheit() {
        System.out.println("Please enter the temperature in Celsius: ");
        int tempC = sc.nextInt();
        int tempF = (tempC * 9 / 5) + 32;
        System.out.printf("The temperature in Fahrenheit is %d.",tempF);
    }

    private static void convertCelsius() {
        System.out.println("Please enter the temperature in Fahrenheit: ");
        int tempF = sc.nextInt();
        int tempC = (tempF - 32) * 5 / 9;
        System.out.printf("The temperature in Celsius is %d.",tempC);
    }
}
