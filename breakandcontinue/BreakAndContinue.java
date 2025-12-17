package com.mycompany.breakandcontinue;


public class BreakAndContinue {

    public static void main(String[] args) {
        
        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)
        
        for(int i = 0; i < 10; i++){
            
            if (i == 5){
                break;       //stops here
            }
            
            else if (i == 2){
                continue;     //skip this
            }
            System.out.print(i + " ");
        }
    }
}
