/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framedemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author HP
 */
public class movingbanner extends Frame implements Runnable{

    /**
     * @param args the command line arguments
     */
    Thread t;
    String str="Java Programming";
    char c;
    movingbanner()
    {
        t=new Thread(this);
        t.start();
        setSize(600,400);
        setVisible(true);
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
            c = str.charAt(0);// java => j // avaj => a
            str = str.substring(1);// ava // vaj
            str = str + c;//avaj //vaja
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
        setBackground(Color.YELLOW);
        setForeground(Color.red);
        Font f=new Font("Arial",Font.BOLD,40);
        g.setFont(f);
        g.drawString(str, 100, 100);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new movingbanner();
    }
    
}
