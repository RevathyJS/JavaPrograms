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
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      forloop obj=new forloop();
      obj.display();
    }
    
}
class forloop
{
    Scanner sc=new Scanner(System.in);
    int i=sc.nextInt();
    boolean found=false;
   
    void display()
    {
        System.out.println(i);
        int nums[]={1,5,3,4,2,9,77,44,33,22,80};
        for(int j : nums)
        {
            if(j == i)
            {
                found=true;
                break;
            }
        }
        if(found)
            System.out.println("Value found");
        else
            System.out.println("Value not found");
    }
}
