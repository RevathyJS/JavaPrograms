
package swingdemo;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;  
public class CheckBoxExample implements ItemListener
{  
    JLabel l;
    JCheckBox checkBox1,checkBox2;
     CheckBoxExample(){  
        JFrame f= new JFrame("CheckBox Example");  
        checkBox1 = new JCheckBox("C++");  
        checkBox1.setBounds(100,100, 100,50);  
        checkBox2 = new JCheckBox("Java");  
        checkBox2.setBounds(100,150, 100,50);  
        l=new JLabel();
        l.setBounds(100,200,200,50);
        f.add(checkBox1);  
        f.add(checkBox2);  
        f.add(l);
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }  
     public void itemStateChanged(ItemEvent ie)
     {
          // Object source = ie.getItemSelectable();
           if(checkBox1.isSelected())
           {
            l.setText("C++ Selected");
            //checkBox1.setSelected(false);
           }
            else if(checkBox2.isSelected())
            l.setText("Java Selected");
           else
            l.setText("Not Selected any item");
        
     }
public static void main(String args[])  
    {  
    new CheckBoxExample();  
    }}  