package com.mycompany.compoundinterestcalculator;

import java.util.Scanner;


public class CompoundInterestCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        
        System.out.print("Enter the intetest rate (in %): ");
        rate = scanner.nextDouble();
        
        System.out.print("Enter the # of times compunded per year: ");
        timesCompounded = scanner.nextInt();
        
        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();
        
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        
        System.out.printf("The amount after %d years is %.2f", years, amount);
        
        scanner.close();
        
    }
}
