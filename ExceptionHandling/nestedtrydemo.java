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
public class nestedtrydemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            int a =Integer.parseInt(args[0]);
            int b =Integer.parseInt(args[1]);
            try
            {
               System.out.println(a/b);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException e)
        {
            System.out.println(e);
        }
    }
    
}
