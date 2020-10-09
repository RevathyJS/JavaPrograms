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
class Q
{
    int n;
    boolean value=false;
    synchronized int get()
    {
        while(!value)
        try
        {
            wait();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Got"+n);
        value=false;
        notify();
        return n;
    }
    synchronized void put(int n)
    {
        while(value)
            try{
                wait();
            }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        this.n=n;
        value=true;
        System.out.println("put:"+ n);
        notify();
        
    }
}
class producer implements Runnable
{
    Q p;
    producer(Q p)
    {
        this.p =p;
        new Thread(this,"producer").start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            p.put(i++);
        }
    }
}
class consumer implements Runnable
{
    Q p;
    consumer(Q p)
    {
        this.p =p;
        new Thread(this,"consumer").start();
    }
    public void run()
    {
        while(true)
        {
            p.get();
        }
    }
}
public class sample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException  {
       Q p=new Q();
       new producer(p);
       new consumer(p);
       
    }
}
