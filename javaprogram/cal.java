/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class cal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=10,b=3;
        Scanner obj=new Scanner(System.in);
        char c=obj.next().charAt(0);
        
       
        switch(c)
        {
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            default:
                System.out.println("Incorrect option");
        }
        String opt=obj.next();
        switch(opt)
        {
            case "add": System.out.println(a+b);
            break;
            
        }
        // TODO code application logic here
    }
    
}
