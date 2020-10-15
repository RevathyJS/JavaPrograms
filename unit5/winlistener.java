/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;

/**
 *
 * @author HP
 */
public class winlistener extends Applet implements KeyListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Graphics g;
    public void init() {
        // TODO start asynchronous download of heavy resources
        g=getGraphics();
        addKeyListener(this);
    }
public void keyPressed(KeyEvent e)
{
    g.drawString("Pressed",150, 150);
}
  public void keyTyped(KeyEvent e)
{
    g.drawString("Typed",100, 100);
}
public void keyReleased(KeyEvent e)
{
    g.drawString("Released",120, 120);
} 

}