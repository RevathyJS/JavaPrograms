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
public class sumofnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,sum=0;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit");
        n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            sum= sum + obj.nextInt();
        }
        System.out.println("The sum of numbers"+sum);
        // TODO code application logic here
    }
    
}
