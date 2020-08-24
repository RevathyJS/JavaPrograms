/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;
/**
 *
 * @author HP
 */
public class inhandintdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        demo obj=new demo();
        obj.display();
        obj.display1();
        
        int2 obj1=new demo();
        obj1.display1();
    }
    
}
class inher
{
    void display()
    {
        System.out.println("Inheritance");
    }
}
interface int2
{
    void display1();
}
class demo extends inher implements int2
{
    public void display1()
    {
        System.out.println("Interface method");
    }
}