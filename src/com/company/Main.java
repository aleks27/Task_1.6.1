package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("How many nambers are you going to enter? ");
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Program is finished.");
            System.exit(0);
        }
        Integer[] numbers = new Integer[size];
        System.out.println("Enter integer numbers throught space and enter <Enter> button: ");
        for (int i = 0; i < size; i++)
            numbers[i] = in.nextInt();

        // 1. Четные и нечетные числа
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0)
                System.out.println("Odd numbers: " + numbers[i]) ;
            else

                System.out.println("Even numbers: " + numbers[i]);
        }
    }}

