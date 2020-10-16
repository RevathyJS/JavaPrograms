
package swingdemo;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Radiodemo {

    public static void main(String[] args) {
       new radioprg();
    }
    
}
class radioprg  implements ItemListener
{
    JFrame f;
    JRadioButton b1,b2;
    ButtonGroup bg;
    JLabel l;
    radioprg()
    {
        f=new JFrame();
        b1=new JRadioButton("Rabbit");
        b2=new JRadioButton("Parrot");
        bg=new ButtonGroup();
        l=new JLabel();
        l.setBounds(200,50,100,30); 
        bg.add(b1);
        bg.add(b2);
        f.add(b1);
        b1.setBounds(100,50,100,30);     
        f.add(b2);
        b2.setBounds(100,100,100,30); 
       
        f.add(l);
        b1.addItemListener(this);
        b2.addItemListener(this);
        f.setSize(800,800);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent it)
    {
        if(b1.isSelected())
          l.setIcon(new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\unit5\\src\\swingdemo\\images.jpg"));
        if(b2.isSelected())
          l.setIcon(new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\unit5\\src\\swingdemo\\parrot.jpg"));
    }
}