/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sringhandlingdemo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class stringconverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 7867356h7847oi678 => 78673567847678
        //Ascii 0-9 48 to 57
       String str=new String();
       Scanner obj1=new Scanner(System.in);
       System.out.println("Enter the String");
       str=obj1.next();
       test obj=new test();
       System.out.println(obj.stringchecker(str));
    }
    
}
class test
{
    StringBuffer stringchecker(String str)
    {
        StringBuffer str1=new StringBuffer(str);
        for(int i=0;i<str1.length();i++)
       {
           if(str1.charAt(i)<48 || str1.charAt(i)>57)
           {
               str1.deleteCharAt(i);
               i--;
           }
       }
       return str1; 
    }
}