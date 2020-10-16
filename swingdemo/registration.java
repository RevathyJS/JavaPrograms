
package swingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class registration implements ActionListener{  
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField tf1,tf3;
    JTextArea tf2;
    JRadioButton r1,r2;
    JButton b1; 
    ButtonGroup bg;
    JComboBox cb,cb1;
    registration(){  
        JFrame f= new JFrame(); 
        l1=new JLabel("Name");
        l1.setBounds(50,50,150,20);  
        l2=new JLabel("Address");
        l2.setBounds(50,100,150,20);  
        l3=new JLabel("Phone No");
        l3.setBounds(50,200,150,20); 
        tf1=new JTextField();  
        tf1.setBounds(200,50,150,20);  
        tf2=new JTextArea();  
        tf2.setBounds(200,100,150,80);  
        tf3=new JTextField();  
        tf3.setBounds(200,200,150,20);  
        l4=new JLabel("Gender");
        l4.setBounds(50,250,150,50); 
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        b1=new JButton("Submit");  
        r1.setBounds(200,250,100,50);  
        r2.setBounds(300,250,100,50);
        String dept[]={"CSE","ECE","EEE","IT","MECH"};        
        cb=new JComboBox(dept); 
        String languages[]={"C","C++","C#","Java","PHP"};        
        cb1=new JComboBox(languages);        
        cb.setBounds(200,300,70,50);          
        cb1.setBounds(300,300,70,50); 
        b1.setBounds(200,400,100,30);
        b1.addActionListener(this);          
        f.add(l1); f.add(l2); f.add(l3);f.add(l4);
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(r1);f.add(r2);  f.add(cb);f.add(cb1);f.add(b1);
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }         
    public void actionPerformed(ActionEvent e) {  
       
        if(e.getSource()==b1){  
            JOptionPane.showMessageDialog(null,"User Name:"+tf1.getText()+"\nSelected Course:"+cb1.getItemAt(cb1.getSelectedIndex()));
        }
    }  
public static void main(String[] args) {  
    new registration();  
} }  