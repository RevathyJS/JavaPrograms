/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceprogram;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class hierarch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student1 s[]=new student1[10];
        //s.getbookdetails();
        for(int i=0;i<10;i++)
        {
        s[i]=new student1(); 
        s[i].getstudentdetails();
        s[i].show();
        }
    }
    
}
class book
{
    Scanner obj=new Scanner(System.in);
    public void getbookdetails()
    {
        //get input from user
    }
    public void show()
    {
        //display
    }
}
class student1 extends book
{
    String name;
    public void getstudentdetails()
    {
        super.getbookdetails();
        name =obj.next();
        
    }
    public void show()
    {
        super.show();
    }
}
class staff1 extends book
{
    String name;
    public void getstaffdetails()
    {
        name=obj.next();
    }
    public void show()
    {
        
    }
}