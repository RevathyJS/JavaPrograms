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
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/**
 *
 * @author HP
 */
public class mouselistener extends Applet implements MouseListener, MouseMotionListener {

    String s;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int x, y;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mousePressed(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(100, 100, 50, 50);

    }

    public void mouseReleased(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 50, 50);
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
        int cx = e.getX();
        int cy = e.getY();
        Graphics g = getGraphics();
        g.drawLine(x, y, cx, cy);
        getMousePos(cx, cy);
    }

    public void getMousePos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawOval(100, 100, 50, 50);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
