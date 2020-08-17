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
public class cgpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       double m[] =  new double[10];
       double c[] =  new double[10];
       //float j[]=new float[];
       double sum=0,csum=0;
       int i;
       System.out.println("Enter no of Subjects");
       int n=obj.nextInt();
       for(i=0;i<n;i++)
       {
           System.out.println("Enter Grade and Credit for "+(i+1)+" Subject");
           m[i]= obj.nextDouble();
           c[i]= obj.nextDouble();
           sum = sum + m[i]*c[i];
           csum = csum + c[i];
       }
       System.out.println("CGPA--->"+ (sum/csum));
    }
    
}
