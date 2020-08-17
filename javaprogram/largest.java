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
public class largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the three no");
        int a= obj.nextInt();
        int b= obj.nextInt();
        int c= obj.nextInt();
        if(a>b && a>c)
        
            System.out.print(a+"is largest");
        
        else if(b>a && b>c)
        
            System.out.print(b+"is largest");
        
        else
            System.out.println(c+"is largest");
    }
    
}
