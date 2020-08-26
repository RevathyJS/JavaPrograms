/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclassdemo;

/**
 *
 * @author HP
 */
public class interfaceanydemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        demo obj=new demo()
        {
            public void display()
            {
                System.out.println("Interface method");
            }
        };
        obj.display();
        demo1 obj1=new demo1()
        {
             public void display1()
            {
                System.out.println("Abstract method");
            }
        };
        obj1.display1();
    }
    
}
interface demo
{
    void display();
}
abstract class demo1
{
abstract void display1();
}