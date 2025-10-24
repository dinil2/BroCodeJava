package com.mycompany.shoppingcartproject;

import java.util.Scanner;

public class Shoppingcartproject {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String item;
        double price;
        int quantity;
        char currencey = '$';
        double total;
        
        System.out.print("What Item whould you like to buy?: ");
        item = scanner.nextLine();
        
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();
        
        total = price * quantity;
        
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currencey + total);
        
        scanner.close();
        
    }
}
