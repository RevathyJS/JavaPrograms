
package swingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class labeldemo implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JButton b1;
labeldemo()
{
    f=new JFrame();
    //f.setSize(500,500);
    f.setVisible(true);
    f.setLayout(null);
    l1=new JLabel("First Label");  
    l1.setBounds(50,50, 100,30);  
    l2=new JLabel("Second Label."); 
    l2.setBounds(50,100, 100,30);  
    b1=new JButton(new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\unit5\\src\\swingdemo\\4.jpg"));
    b1.setBounds(50,150,79,69);  
    f.add(l1); f.add(l2);  f.add(b1);
    f.setSize(300,300); 
    b1.addActionListener(this);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    public static void main(String[] args) {
       new labeldemo();
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s=l1.getText();
        l2.setText(s);
        //new radioprg();
    }
}
