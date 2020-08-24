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
public class test 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        inter obj=new sample();
        obj.display();
    }
    
}
interface inter
{
    int a=10;
    void display();
}
interface inter1
{
    void display1();
}
class sample implements inter,inter1
{
   public void display() // inter
    {
       // a = a+10;
       System.out.println("Interface implementation"+(a+10)); 
    }
  
   public void display1()
   {
       System.out.println("Interface implementation 2"); 
   }
}