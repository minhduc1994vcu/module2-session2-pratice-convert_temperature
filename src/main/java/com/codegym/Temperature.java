package com.codegym;

import java.util.Scanner;

public class Temperature {
   static double celsius, fahrenheit;
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;


        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    fahrenheitToCelsius();
                    break;
                case 2:
                    celsiusToFahrenheit();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }

    private static void fahrenheitToCelsius() {
        System.out.println("enter fahrenheit: ");
        fahrenheit = input.nextDouble();
        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("celsius is: " + celsius);
    }

    private static void celsiusToFahrenheit() {
        System.out.println("enter celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("fahrenheit is: " + fahrenheit);
    }


}
