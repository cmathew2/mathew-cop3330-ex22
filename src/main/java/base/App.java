/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int first = in.nextInt();
        System.out.println("Enter the second number: ");
        int second = in.nextInt();
        System.out.println("Enter the third number: ");
        int third = in.nextInt();

        if ((first == second) || (second == third) || (first == third)) {
            System.exit(0);
        }

        int largest = 0;

        if (first >= second && first >= third) {
            largest = first;
        } else if (second >= first && second >= third) {
            largest = second;
        } else {
            largest = third;
        }

        System.out.println("The largest number is " + largest + ".");
    }
}
