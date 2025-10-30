package com.mycompany.switchmethodjava;

import java.util.Scanner;

public class SwitchMethodJava {

    public static void main(String[] args) {
        
        // enhanced switch = A replacement to many if else statements
        // (Java 14 feature)
        
        Scanner scanner = new Scanner(System.in);
        
        String day;
        
        System.out.print("The day is: ");
        day = scanner.next();
        
        switch(day){
            case "Monday" -> System.out.println("It is a weekday ");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednessday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day + " is not a day");
        }
        scanner.close();
    }
}


/*System.out.print("The day is: ");
        day = scanner.next();
        
        switch(day){
            case "Monday", "Tuesday", "Wednessday","Thursday","Friday" ->
                          System.out.println("It is a weekday")
            case "Saturday", "Sunday" ->
                           System.out.println("It is a weekend");
            default -> System.out.println(day + " is not a day");
        }
*/