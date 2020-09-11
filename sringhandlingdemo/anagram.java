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
public class anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        boolean flag=true;
        System.out.println("Enter 2 string");
        String s=obj.next();
        String s1=obj.next();
        s=s.toLowerCase().trim();
        s1=s1.toLowerCase().trim();
        char c[]=s.toCharArray();
        char c1[]=s1.toCharArray();
        sample obj1=new sample();
        c=obj1.sort(c);
        c1=obj1.sort(c1);
       /* System.out.println("After sorting");
        for(int i=0;i<c.length;i++)
        System.out.println(c[i]);
        for(int i=0;i<c1.length;i++)
        System.out.println(c1[i]);*/
       for(int i=0;i<c.length;i++)
       {
           if(c[i]!=c1[i])
           {
               flag = false;
               break;
           }
       }
       if(flag)
           System.out.println("anagrams");
       else
           System.out.println("not anagrams");
        
    }
    
}
class sample
{
   char[] sort(char c[])
    {
        char temp;
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]>c[j])
                {
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        return c;
        
    }
}
