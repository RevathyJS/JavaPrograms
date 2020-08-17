/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

/**
 *
 * @author HP
 */
public class shift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = -4;
        int y = 4;
        System.out.println(x>>1);
        System.out.println(y>>1);
        
        // x is stored using 32 bit 2's complement form.  
       // Binary representation of -1 is all 1s (111..1)        
       x = -1;   
  
       System.out.println(x>>>29);  // The value of 'x>>>29' is 00...0111 
       System.out.println(x>>>30);  // The value of 'x>>>30' is 00...0011  
       System.out.println(x>>>31);  // The value of 'x>>>31' is 00...0001  
    }
    
}
