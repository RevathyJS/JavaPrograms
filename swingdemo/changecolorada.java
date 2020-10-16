
package swingdemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
public class changecolorada {
    public static void main(String[] args) {
        new colordemo1();
    }    
}
class colordemo1 extends MouseAdapter
{
    int c=0;
    JFrame f;
    colordemo1()
    {
        f=new JFrame();
        f.addMouseListener(this);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
 public void mouseClicked(MouseEvent e){
    Graphics g=f.getGraphics();
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
 
  
}