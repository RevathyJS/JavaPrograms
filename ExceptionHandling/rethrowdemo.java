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
public class rethrowdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sample obj=new sample();
        try
        {
            obj.add();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Rethrown Exception:"+e);
        }
    }
    
}
class sample
{
    void add()
    {
        try
        {
            int a=10,b=0;
            int c=a/b;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Exception:"+ae);
            throw ae;// rethrowing catch method in method call
        }
    }
}