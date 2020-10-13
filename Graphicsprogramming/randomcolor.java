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
public class randomcolor extends Applet {
   public void paint(Graphics g) {
          int rval, gval, bval;
 
          for (int j = 30; j < (size().height -25); j += 30)
            for (int i = 5; i < (size().width -25); i += 30) {
                rval = (int)Math.floor(Math.random() * 256);
                gval = (int)Math.floor(Math.random() * 256);
                bval = (int)Math.floor(Math.random() * 256);

                g.setColor(new Color(rval,gval,bval));
                g.fillRect(i, j, 25, 25);
                g.setColor(Color.BLACK);
                g.drawRect(i-1, j-1, 25, 25);
            }
     }
 }