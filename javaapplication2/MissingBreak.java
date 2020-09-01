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
public class MissingBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           for(int i=0; i<12; i++)      
               switch(i) {        
                   case 0:        
                   case 1:         
                   case 2:         
                   case 3:         
                   case 4:           
                       System.out.println("i is less than 5");          
                       break;        
                   case 5:        
                   case 6:         
                   case 7:         
                   case 8:         
                   case 9:          
                       System.out.println("i is less than 10");         
                       break;         
                   default:           
                       System.out.println("i is 10 or more");       }   
    }
    
}
