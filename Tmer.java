/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tmer;

import java.util.Scanner;

/**
 *
 * @author Ali Asghar
 */
public class Tmer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       try {
          
       
        Scanner c=new Scanner(System.in);
        System.out.println("enter the number to check your blood sugar");
        
        int check=c.nextInt();
        System.out.println("wait for three seconds");
        Thread.sleep(3000);
        System.out.println("3");
        Thread.sleep(2000);
        System.out.println("2");
        Thread.sleep(2000);
        System.out.println("1");
        Thread.sleep(2000);
        
        
       int high=100,low=50;
        
       
           if(check<50){
               System.out.println("blood sugar is low");
           }
               else if(check>high){
                   System.out.println("  the blood sugar limit is 1 to 100");
               }
               else{
                       System.out.println("the Sugar blood is Normal");
           }  }
           catch (Exception e){
               System.out.println("please enter only numbers");        
                   }
           }
       
        // TODO code application logic here
    
    
}
