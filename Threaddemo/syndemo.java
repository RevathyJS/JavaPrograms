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
public class syndemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        table obj=new table();
        table obj1=new table();
        th1 t1=new th1(obj); // 1 & 2 first table object
        th2 t2=new th2(obj);
        th3 t3=new th3(obj1);// 3 & 4 first table object
        th4 t4=new th4(obj1);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
class table // 2,3,4,5
{
   static synchronized public void print(int n) // synchronized method
    {
        
        for(int i=1;i<=5;i++)
        {
            try
            {
            System.out.println(i+"*"+n+"="+i*n); // 1*2=2  2*2=4
            Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        }
    }

class th1 extends Thread
{
    table t;
    th1(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(2);
    }
}
class th2 extends Thread
{
    table t;
    th2(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(3);
    }
}
class th3 extends Thread
{
    table t;
    th3(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(4);
    }
}
class th4 extends Thread
{
    table t;
    th4(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(5);
    }
}