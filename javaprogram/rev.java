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
public class rev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n= obj.nextInt();
        int a[]=new int[10];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        // TODO code application logic here
    }
    
}
