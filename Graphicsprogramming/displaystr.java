/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphicsprogramming;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author HP
 */
public class displaystr extends Applet implements Runnable {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Thread t;

    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.BLUE);
        setForeground(Color.MAGENTA);
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            for(int i=10;i<=100;i+=10)
            {
            Thread.sleep(1000);
            setBackground(new Color(10+i,10+i,10+i));
            setForeground(new Color(200-i,200-i,100-i));
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g) {

        g.drawString("Java programming", 100, 100);
    }
}
