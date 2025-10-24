
package com.mycompany.ifstatement;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String name;
        int age;
        boolean isStudent;
        
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        
        System.out.println("You you a student (true/false): ");
        isStudent = scanner.nextBoolean();
        
        //Group1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name");
        }
        else{
            System.out.println("Hello " + name + "!");
        }
        //Group2
        if(age >= 65){
            System.out.println("You are senior");
        }
        else if(age >=18){
            System.out.println("You are an adult");
        }
        else if(age <0){
            System.out.println("You haven't born yet");
        }
        else{
            System.out.println("You are a child");
        }
        
        //Group3
        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }
        
        scanner.close();
    }
}
