package com.mycompany.logicaloperatorsjava;

import java.util.Scanner;

public class LogicalOperatorsJava {

    public static void main(String[] args) {
        
        // && = AND
        // || = OR
        // !  = NOT
        
        Scanner scanner = new Scanner(System.in);
        
        // username must be 4-12 char
        // username must not contains space or underscore
        
        String username;
        
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();
        
        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain space or underscores");
        }
        else{
            System.out.println("Welcome " + username); 
        }
        
        scanner.close();
    }
}
