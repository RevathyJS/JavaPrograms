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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author HP
 */
public class frame2 extends MouseAdapter {

    /**
     * @param args the command line arguments
     */
    Frame f;

    //String str="Java Programming";
    frame2() {
        f = new Frame("Demo2");
        f.setSize(600, 400);
        f.setBackground(Color.yellow);
        f.setVisible(true);
        f.repaint();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
        //f.addMouseListener(this);
    }

    /*  public void mouseClicked(MouseEvent me)
    {
        Graphics g=f.getGraphics();
        f.setBackground(Color.cyan);
        g.drawString(str,100,100);
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
        new frame2();
    }

}
