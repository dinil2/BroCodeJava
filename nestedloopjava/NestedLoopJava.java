package com.mycompany.nestedloopjava;


public class NestedLoopJava {

    public static void main(String[] args) {
        
        // nested loop = A loop inside another loop
        for (int i = 1; i <= 3; i++){
        
            for(int j = 0; j <= 9; j++){
            System.out.print(j + " ");
        }
            System.out.println();
        }
    }
}
