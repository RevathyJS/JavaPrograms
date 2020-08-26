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
public class staticinner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        staticdemo.demo obj=new staticdemo.demo();
        obj.display();
    }
    
}
class staticdemo
{
    static class demo
    {
        void display()
        {
            System.out.println("Static method");
        }
    }
}
