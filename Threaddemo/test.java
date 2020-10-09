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
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        thread1 obj=new thread1();
        thread2 obj1=new thread2();
        obj.start();
        obj.join(400);
        obj1.start();
        
        //int i=25/0;
        //System.out.println(i);
        //System.out.println(obj.isAlive());
        //obj.setName("Hi Thread");
        //obj1.setName("Hello Thread");
        //System.out.println(obj.getName());
        //System.out.println(obj1.getName());
        //System.out.println(obj.getId());
        //System.out.println(obj1.getId());
        //priority => 1 to 10
        // 1 ---> lowest
        //10 ---> highest
        // default --> 5
        //obj.setPriority(10);
        //System.out.println(obj.getPriority());
        //System.out.println(obj1.getPriority());
         // it will wait for the thread to die
        
        obj1.join();
       // System.out.println(obj.isAlive());
        System.out.println("Finished");
        
    }
}
class thread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
            try{
            Thread.sleep(200);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class thread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
            try{
            Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
