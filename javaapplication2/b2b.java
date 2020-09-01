/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class b2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a[]=new int[10];
       
    }
    
}
class student
{
    String name;
    String rollno;
    double cgpa;
    public void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter data");
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            name=obj.next();
            rollno=obj.next();
            cgpa=obj.nextDouble();
        }
    }
}