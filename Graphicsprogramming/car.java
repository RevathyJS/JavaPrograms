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
public class car extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g)
    {
      /*  setBackground(new Color(192, 128, 64));
        g.setColor(Color.BLACK);
	g.fillRect(10, 30, 100, 50);
	g.drawLine(20, 0, 10, 30);
	g.setColor(Color.RED);
	g.fillOval(60, 40, 40, 70);*/
        
       setBackground(Color.LIGHT_GRAY);
       
        
        g.setColor(Color.BLACK);
        g.fillRect(10, 30, 100, 50);
        
        g.setColor(Color.RED);
        g.fillOval(20, 70, 20, 20);
        g.fillOval(80, 70, 20, 20);
        
        g.setColor(Color.CYAN);
        g.fillRect(80, 40, 30, 20);


    }
}
