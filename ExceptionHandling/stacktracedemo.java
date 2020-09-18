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
public class stacktracedemo 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        try
        {
            throw new ArithmeticException("/ by zero");
        }
        catch(ArithmeticException e)
        {     
            System.out.println(e);
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement s : stackTrace) 
            {
                System.out.println("at " + s.getClassName() + "." + s.getMethodName()+ "(" + s.getFileName() + ":" + s.getLineNumber() + ")");
            }
        }
    }
}
    

