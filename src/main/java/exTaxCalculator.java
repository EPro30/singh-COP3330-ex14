/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exTaxCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double amt = sc.nextDouble();
        System.out.println("What is the State?");
        String state = sc.next();
        double tax = 0;
        if(state.compareToIgnoreCase("WI") == 0) //Determining if the state is Wisconsin or not
        {
            tax = amt*(5.5/100); //Calculating the the tax rate for the given amount
            System.out.printf("The subtotal is $%.2f. \nThe tax is $%.2f.\n", amt, tax);
        }
        double total = amt + tax;
        System.out.printf("The total is $%.2f.", total);
    }
}
