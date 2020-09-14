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
public class demoexception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int i=10;
       int j=2;
       int a[]=new int[3]; // 0 1 2
       Scanner obj=new Scanner(System.in);
       String s=null;
       try // try block ==> any no of catch block
       {
       int k=i/j;
       k =Integer.parseInt( obj.next());//
       System.out.println(k);
       //a[3]=10;
       s.substring(2);
       }
       
       catch(ArrayIndexOutOfBoundsException e) //catch block
        {
           System.out.println(e);
        }
        catch(NumberFormatException e) //catch block
       {
           System.out.println(e);
       }
       catch(Exception e) //catch block
        {
           System.out.println(e);
        }
            
    }
    
}
