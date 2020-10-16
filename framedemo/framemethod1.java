/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framedemo;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author HP
 */
public class framemethod1 extends Frame implements Runnable{

    /**
     * @param args the command line arguments
     */
    Thread t;
    String str="";
    int i=0;
    framemethod1()
    {
        t=new Thread(this);
        setSize(600,400);
        setTitle("Frame Demo");
        setVisible(true);
        t.start();
        addWindowListener(new WindowAdapter()
        {
           public void windowClosing(WindowEvent we)
           {
               dispose();
           }
        });
    }
    public void run()
    {
        try
        {
        while(true)
        {
           i++;
           str = String.valueOf(i);// 0 1 2 3 4 
           Thread.sleep(100);
           repaint();
        }
        }
        catch(Exception e)
        {
            
        }
    }
    public void paint(Graphics g)
    {
        setBackground(Color.CYAN);
        setForeground(Color.red);
        Font f=new Font("Arial",Font.BOLD,40);
        g.setFont(f);
        g.drawString(str,300,200);
        g.drawOval(230, 100, 200, 200);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new framemethod1();
    }
    
}
