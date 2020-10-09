/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programthread;

/**
 *
 * @author HP
 */
public class joindemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test m1=new test("One");
        test m2=new test("Two");
        test m3=new test("Three");
        m1.t.setPriority(m1.t.getPriority()+2);
        m2.t.setPriority((Thread.MIN_PRIORITY)+2);
        m3.t.setPriority(Thread.MAX_PRIORITY);
        
        System.out.println(m1.t.isAlive());
       /* try
        {
            m1.t.suspend();
            System.out.println("Suspend thread m1");
            Thread.sleep(5000);
            m1.t.resume();
            System.out.println("Resume Thread m1");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }*/
        try
        {
            System.out.println("Waiting for the child thread to complete");
            m1.t.join();
            m2.t.join();
            m3.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(m1.t.isAlive());
        System.out.println("Main Thread Exists");
    }
    
}
class test implements Runnable
{
    String name;
    Thread t;
    //test tar=new test();
    test(String n)
    {
        name =n;
        t=new Thread(this,name);
        System.out.println("Child Thread"+t);
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=4;i>0;i--)
            {
                System.out.println("Child "+name+" Thread"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Interrupted");
        }
        System.out.println("Child Thread"+name+"exists");
    }
}