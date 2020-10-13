
package Graphicsprogramming;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class fontdemo extends Applet {

  public void paint(Graphics g) {
        Font f = new Font("TimesRoman", Font.PLAIN, 18);
        Font fb = new Font("TimesRoman", Font.BOLD, 18);
        Font fi = new Font("TimesRoman", Font.ITALIC, 18);
        Font fbi = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);

        g.setFont(f);
        g.drawString("This is a plain font", 10, 25);
        g.setFont(fb);
        g.drawString("This is a bold font", 10, 50);
        g.setFont(fi);
        g.drawString("This is an italic font", 10, 75);
        g.setFont(fbi);
        g.drawString("This is a bold italic font", 10, 100);
    }

 }