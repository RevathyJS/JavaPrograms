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
public class Nobody {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int i, j; 
 
         i = 100;     
         j = 200; 
 
    // find midpoint between i and j     
    while(++i < --j); // no body in this loop 
     System.out.println("Midpoint is " + i); 
    }
    
}
