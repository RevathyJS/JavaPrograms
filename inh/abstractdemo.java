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
public class abstractdemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       sample obj=new circle(); // Dynamic method dispatch
       obj.read();
       obj.findarea();
       obj.display();
       obj=new square();
       obj.read();
       obj.findarea();
       obj.display();
       //or
       circle obj1=new circle();
       obj1.read();
    }
    
}
abstract class sample
{
    abstract void read();
    abstract void findarea();
    abstract void display();
    Scanner obj=new Scanner(System.in);
    void demo()
    {
        System.out.println("Abstract Demo");
    }
}
class circle extends sample
{
    double radius,area;
    void read()
    {
       radius = obj.nextDouble();
    }
    void findarea()
    {
        area = Math.PI*radius*radius;
    }
    void display()
    {
        System.out.println("Area of circle"+area);
    }
}
class square extends sample
{
    int side,area;
    void read()
    {
       side = obj.nextInt();
    }
    void findarea()
    {
        area = 4*side;
    }
    void display()
    {
        System.out.println("Area of circle"+area);
    }
    
}