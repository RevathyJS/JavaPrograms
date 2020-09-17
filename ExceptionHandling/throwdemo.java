/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author HP
 */
public class throwdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        int a=30,b=20;
        if(a<b)
        throw new ArithmeticException("a is less than b");
        System.out.println("a is greater");
        }
        catch(ArithmeticException e) // error handled
        {
            System.out.println(e);
        }
       
       
    }
    
}
