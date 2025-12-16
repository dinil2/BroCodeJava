package com.mycompany.forloopsjava;

import java.util.Scanner;

public class ForLoopsJava {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many seconds to countdown from");
        int start = scanner.nextInt();
        
        for(int i = start; i> 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
            
        }
        
        System.out.println("Happy new year");
        
        scanner.close();
       
    }
}

------------------------------------------------------------------------
package com.mycompany.forloopsjava;

import java.util.Scanner;

public class ForLoopsJava {

    public static void main(String[] args) {
        
        // for loop = execute some code a CERTAIN amount of times
        
        // inicialization -> condition -> update
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();
        
        for(int i = 0; i <= max; i++){
            System.out.println(i);
        }
        
        scanner.close();
    }
}

