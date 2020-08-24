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
public class intde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        defi obj=new test2();
        obj.display();
        obj.display1();
        
        test2 obj1=new test2();
        obj1.display();
        obj1.display1();
        
        defi.display2(); // interfacename.methodname();
    }
    
}
interface defi 
{
    void display();
    default void display1()
    {
        System.out.println("Default method impl");
    }
    static void display2()
    {
        System.out.println("Static method");
    }
}
class test2 implements defi
{
    public void display()
    {
        System.out.println("Interface abstract method");
    }
}