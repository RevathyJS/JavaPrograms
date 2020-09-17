/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class negademo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter value");
        try
        {
        int i=obj.nextInt();
        System.out.println("Enter value"+i);
        }
        catch(Exception e)
        {
           StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement s : stackTrace) 
            {
                System.out.println("at " + s.getClassName() + "." + s.getMethodName()+ "(" + s.getFileName() + ":" + s.getLineNumber() + ")");
            }
        }
        
    }
    
}
