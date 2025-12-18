package com.mycompany.methodjava;


public class MethodJava {

    public static void main(String[] args) {
        
        // method = a bloack of reusable code that is executed when call
        
        String name = "Bro";
        int age = 25;
        
        happybirthday(name, age);
        
       
    }
    static void happybirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear you %s!\n", name);
        System.out.printf("You are %d years old\n!", age);
        System.out.println("Happy Birthday to you!\n");
    }
}
 