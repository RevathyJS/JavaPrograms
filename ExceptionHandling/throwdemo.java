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
        //int a,b=10,c=0;
        try
        {
        //a=b/c;
        throw new ArithmeticException(" ");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
       
    }
    
}
