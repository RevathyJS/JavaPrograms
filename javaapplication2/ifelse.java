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
public class ifelse {

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) 
   {    
    int month = 4;
    String season;
    if(month == 12 || month == 1 || month == 2)    
    season = "Winter";   
    else if(month == 3 || month == 4 || month == 5)
    season = "Spring";   
    else if(month == 6 || month == 7 || month == 8)  
    season = "Summer";    
    else if(month == 9 || month == 10 || month == 11)      
    season = "Autumn";     
    else       
    season = "Bogus Month"; 
    System.out.println("April is in the " + season + ".");   
   } 
}