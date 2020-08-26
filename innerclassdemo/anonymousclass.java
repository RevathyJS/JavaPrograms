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
public class anonymousclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sample obj=new sample()
        {
          void display()
          {
              System.out.println("Anonymous inner class");
          }
         
        };
        obj.display();
        sample1 obj1=new sample1()
        {
          void display1()
          {
              System.out.println("Anonymous inner class");
          }
         
        };
        obj1.display1();
        
    }
    
}
abstract class sample
{
    abstract void display();
    
}
abstract class sample1
{
abstract void display1();
}
/*class test extends sample
{
    void display()
    {
        
    }
}*/