/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author HP
 */
public class mousemotionlistener extends Applet implements MouseMotionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        resize(600,400);
        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.drawOval(e.getX(), e.getY(), 1, 1);
    }

    public void mouseMoved(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.red);
        g.drawOval(e.getX(), e.getY(), 10, 10);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
