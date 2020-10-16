package swingdemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
public class changecolor {
    public static void main(String[] args) {
        new colordemo();
    }    
}
class colordemo extends JFrame implements MouseListener
{
    int c=0;
    colordemo()
    {
        addMouseListener(this);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 public void mouseClicked(MouseEvent e){
    Graphics g=getGraphics();
    c++;
    if(c%2==0)
    {
        g.setColor(Color.yellow);
        g.fillOval(150,150,100,100);
    }
    else
    {
        g.setColor(Color.green);
        g.fillOval(150,150,100,100);
    }
   }
    
  public void mousePressed(MouseEvent e){  }
  public void mouseReleased(MouseEvent e){   }
  public void mouseEntered(MouseEvent e){   }
  public void mouseExited(MouseEvent e){   }
  
}