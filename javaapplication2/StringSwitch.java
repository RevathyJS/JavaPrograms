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
public class StringSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String str = "two"; 
 
    switch(str) {      
        case "one":      
            System.out.println("one");       
            break;       
        case "two":       
            System.out.println("two");       
            break;      
        case "three":       
            System.out.println("three");
            break;      
    default:         
    System.out.println("no match");       
    break;   
    }
    
}}
