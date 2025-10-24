package com.mycompany.brocodemath2;

import java.util.Scanner;

public class BroCodeMath2 {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
    double radius;
    double circumference;
    double area;
    double volume;
    
    System.out.print("Enter the radious: ");
    radius = scanner.nextDouble(); 
    
    circumference = 2 * Math.PI * radius;
    area = Math.PI * Math.pow(radius, 2);
    volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
            
    System.out.printf("The circumference is: %.1fcm\n", circumference); //one digit .1
    System.out.printf("The are is: %.1fcm²\n" + area);
    System.out.printf("The volume is: %.1fcm³\n", volume);
    
    scanner.close();
    
    }
}
