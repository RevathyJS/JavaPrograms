/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author HP
 */
public class framedemo extends Frame implements Runnable {

    int c = 0;
    Thread t;

    public static void main(String[] args) {
        new framedemo();
    }

    framedemo() {
        setSize(500, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
        t = new Thread(this);

        t.start();

    }

    public void run() {
        while (true) {
            c++;
            repaint();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }

    public void paint(Graphics g) {
        String counter = c + "";
        Font f=new Font("Arial",Font.BOLD,40);
        g.setFont(f);
        g.drawString(counter, 100, 110);
        g.drawOval(60, 45, 110, 110);
    }

}
