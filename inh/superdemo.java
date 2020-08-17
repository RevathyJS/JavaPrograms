/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inh;

/**
 *
 * @author HP
 */
public class superdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bike obj=new bike();
        obj.display();
    }
    
}
class vehicle
{
    int speed=50;
    vehicle()
    {
        System.out.println("vehicle class");
    }
    void display()
    {
        System.out.println("Vehicle information");
    }
}
class bike extends vehicle
{
    int speed=100;
    bike()
    {
        super();
        System.out.println("bike class");
    }
    void display()
    {
        super.display();
        System.out.println(super.speed);
        System.out.println(speed);
    }
}