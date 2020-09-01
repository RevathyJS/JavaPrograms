/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author HP
 */
public class ForTick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n; 
          for(n=10; n>0; n--) 
          System.out.println("tick " + n);  
    int a, b; 
 
    for(a=1, b=4; a<b; a++, b--) 
    {       
        System.out.println("a = " + a);     
        System.out.println("b = " + b);   
    }
   
    boolean done = false; 
 
    int i = 0;     
    for( ; !done; )
    {      
        System.out.println("i is " + i);    
        if(i == 10) 
            done = true;     
        i++;   
    }
    
    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };     
    int sum = 0; 
 
    // use for-each style for to display and sum the values     
    for(int x : nums) 
    {      
        System.out.println("Value is: " + x);      
        sum += x;    
    } 
 
    System.out.println("Summation: " + sum); 
    } 
    
} 
 