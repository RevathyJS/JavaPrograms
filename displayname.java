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
public class displayname {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // main
        System.out.println(Thread.currentThread()); // main
        Thread t1=new Thread("New Thread");
        System.out.println(t1);
        sample s=new sample();
        //s.start();
    }
    
}
class sample extends Thread
{
    sample()
    {
        start(); // Thread class
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()); // sample
    }
}