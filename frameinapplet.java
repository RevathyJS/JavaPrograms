/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author HP
 */
public class frameinapplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Frame f;
    public void init() {
        // TODO start asynchronous download of heavy resources
        f=new sampleFrame(); // Frame f=new Frame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
class sampleFrame extends Frame
{
    sampleFrame()
    {
         addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}