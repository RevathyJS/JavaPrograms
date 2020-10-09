/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threaddemo;

/**
 *
 * @author HP
 */
public class runnabledemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        test1 obj=new test1();
        Thread t1=new Thread(obj);
        t1.start();
        
        //System.out.println(Thread.currentThread().getName());
    }
    
}
class abc
{
    void display()
    {
        
    }
}
class test1 extends abc implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("hi");
        }
    }
}