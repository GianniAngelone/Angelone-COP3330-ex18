/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.printf("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit. ");
        System.out.printf("\nYour choice: ");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("C")) {
            System.out.printf("Please enter the temperature in Fahrenheit: ");
            int temperature = scan.nextInt();
            double Celsius = (temperature - 32) * 5 / 9;
            System.out.print(String.format("The temperature in Fahrenheit is: %.0f", Celsius));
        }
        else {
            System.out.printf("Please enter the temperature in Celsius: ");
            int temperature = scan.nextInt();
            double Fahrenheit  = (temperature * 9 / 5) + 32;
            System.out.print(String.format("The temperature in Fahrenheit is: %.0f", Fahrenheit));
        }
    }
}