/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.lang.Math;

public class solution13 {

    /*
    Print "What is the principal amount?"
    'principal' = input from user

    Print "What is the rate?"
    'rate' = input from user

    turn 'rate' into percentage
    'finalRate' = 'rate'/100

    Print "What is the number of years?"
    'years' = input from user

    Print "What is the number of times the interest is compounded per year?"
    'compound' = input from user

    determine the final amount after compounding interest
    'amount1' = ('principal'*(1+('rate'/'compound')
    'amount2' = ('compound'*'year')
    'amount' = Math.pow('amount1','amount2')

    round the amount to the nearest penny

    Print "'principal invested at 'rate'% for 'years' years compounded 'compound' times per year is 'roundedAmount'."
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the principal amount?");
        double principal = scanner.nextDouble();

        System.out.println("What is the rate?");
        double rate = scanner.nextDouble();
        double finalRate = rate/100;

        System.out.println("What is the number of years?");
        int year = scanner.nextInt();

        System.out.println("What is the number of times the interest is compounded per year?");
        int compound = scanner.nextInt();

        float amount1 = (float) (finalRate/compound);
        float amount2 =(1+amount1);
        float amount4 = year*compound;
        float amount5 = (float) Math.pow(amount2, amount4);
        float amount = (float) (principal*amount5);

        BigDecimal roundingAmount = new BigDecimal(amount).setScale(2, RoundingMode.CEILING);
        float finalAmount = roundingAmount.floatValue();

        System.out.println("$"+principal+ " invested at " +rate+ "% for " +year+ " years compounded " +compound+ " times per year is $" +finalAmount);






    }




}
