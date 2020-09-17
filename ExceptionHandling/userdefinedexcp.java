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
public class userdefinedexcp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        userdefinedexcp obj=new userdefinedexcp();
        try
        {
        obj.checker();
        }
        catch(MarkException e)
        {
            System.out.println(e);
        }
       
    }
    void checker() throws MarkException
    {
        // mark cal. [0-100]
        int sub1=-10;
        if(sub1<0 || sub1>100)
            throw new MarkException("Invalid mark");
    }
}
class MarkException extends Exception
{
    String message;
    MarkException(String msg)
    {
       message = msg;
       //super(msg); // calling super class(Exception) constructor
    }
    public String toString()
    {
        return message;
    }
}