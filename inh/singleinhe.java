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
public class singleinhe {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        result obj=new result();
        obj.calculate();
        obj.display();
    }
    }
class student
{
    String name;
    String rollno;
    Scanner obj=new Scanner(System.in);
    public void read()
    {
        System.out.println("Enter Student name");
        name=obj.next();
        System.out.println("Enter Student rollno");
        rollno=obj.next();
    }
    public void display()
    {
        System.out.println("Student Details");
        System.out.println("Student name:"+name);
        System.out.println("Rollno:"+rollno);
        
    }
}
class mark extends student
{
    double m1,m2,m3;
    public void read()
    {
        super.read();
        System.out.println("Enter Mark1");
        m1=obj.nextDouble();
        System.out.println("Enter Mark2");
        m2=obj.nextDouble();
        System.out.println("Enter Mark3");
        m3=obj.nextDouble();
    }
    public void display()
    {
        super.display();
        System.out.println("Student Mark Details");
        System.out.println("Mark1:"+m1+"\nMark2:"+m2+"\nMark3:"+m3);
    }
}
class result extends mark
{
    double total,avg;
    public void calculate()
    {
        super.read();
        total =m1+m2+m3;
        avg = total/3;
    }
    public void display()
    {
        super.display();
        System.out.println("Student Result");
        System.out.println("Total"+total);
        System.out.println("Avergae"+avg);
    }
}
