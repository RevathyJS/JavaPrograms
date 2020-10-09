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
class mythread extends Thread
{
    mythread()
    {
        super("New Thread");
        System.out.println("Child Thread--->"+this);
        start();
    }
    public void run()
    {
        try
        {
            for(int i=4;i>0;i--)
            {
                System.out.println("Child Thread"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Child Thread exists");
    }
}
public class threadclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new mythread();
        try
        {
            for(int i=4;i>0;i--)
            {
                System.out.println("Main Thread"+i);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Main Thread exists");
    }
    
}
