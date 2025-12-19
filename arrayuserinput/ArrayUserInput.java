package com.mycompany.arrayuserinput;

import java.util.Scanner;


public class ArrayUserInput {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size; 
        
        System.out.print("What number of foods do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();
        
        foods = new String[size];
        
        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }
        
        for(String food : foods){
            System.out.print(food);
        }
        scanner.close();
    }
}
