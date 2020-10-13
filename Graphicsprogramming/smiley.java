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
public class smiley extends Applet {

    public void paint(Graphics g)
    {
  g.setColor(Color.yellow);
  g.fillOval(20,20,150,150);   // For face
  g.setColor(Color.black);
  g.fillOval(50,60,15,25);     // Left Eye 
  g.fillOval(120,60,15,25);    // Right Eye
  int x[] = {95,85,106,95};
  int y[] = {85,104,104,85};
  g.drawPolygon(x, y, 4);      // Nose
  g.drawArc(55,95,78,50,0,-180);  // Smile
  g.drawLine(50,126,60,116);   // Smile arc1
  g.drawLine(128,115,139,126);  // Smile arc2
    }
    // TODO overwrite start(), stop() and destroy() methods
}
