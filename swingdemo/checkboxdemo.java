package swingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class checkboxdemo implements ActionListener
{  
    JButton l;
    JCheckBox checkBox1,checkBox2,checkBox3;
     checkboxdemo(){  
        JFrame f= new JFrame("CheckBox Example");  
        checkBox1 = new JCheckBox("Pizza");  
        checkBox1.setBounds(100,100, 100,50);  
        checkBox2 = new JCheckBox("Burger");  
        checkBox2.setBounds(100,150, 100,50);  
        checkBox3 = new JCheckBox("Tea");  
        checkBox3.setBounds(100,200, 100,50); 
        l=new JButton("Generate Bill");
        l.setBounds(100,250, 100,50); 
        f.add(checkBox1);  
        f.add(checkBox2);  
        f.add(checkBox3); 
        f.add(l);
        l.addActionListener(this);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }  
    @Override
     public void actionPerformed(ActionEvent ae)
     {
         double amount=0;
          if(checkBox1.isSelected())
            amount+=100;
          if(checkBox2.isSelected())
            amount+=50;
          if(checkBox3.isSelected())
              amount+=20;
          
          String a=amount+"";
          JOptionPane.showMessageDialog(null,a);
     }
public static void main(String args[])  
    {  
    new checkboxdemo();  
    }}  