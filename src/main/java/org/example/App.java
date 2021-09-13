package org.example;

import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */
public class App 
{
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static double converison (double euros, double exchange)
    {
        return euros*exchange;
    }
    public static void main( String[] args )
    {

        Scanner scan1 = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double euros = scan1.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("What is the exchange rate? ");
        double exchange = scan2.nextDouble();

        double converted;

        converted= converison(euros,exchange);

        System.out.print(euros + " euros at an exchange rate of "+ exchange + " is " + df2.format(converted) + " U.S. dollars.");
    }
}
