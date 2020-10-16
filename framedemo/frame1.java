/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framedemo;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author HP
 */
public class frame1 extends Frame {

    /**
     * @param args the command line arguments
     */
    int x, y;
    
    frame1() {
        setSize(600, 400);
        setTitle("Frame Demo1");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new frame1();
    }

}
