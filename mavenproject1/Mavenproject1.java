package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();
        
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        System.out.println("Hello " + name);
        System.out.println("Your age " + age + "years old");
        System.out.println("Your gpa is " + gpa);
        
        if(isStudent){
            System.out.println("You are enrolled");
        }
        else{
            System.out.println("You are not enrolled"); 
        }
        scanner.close();
        
    }
}
