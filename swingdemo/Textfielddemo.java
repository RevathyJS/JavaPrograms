
package swingdemo;
import javax.swing.*;  
import java.awt.event.*;  
public class Textfielddemo implements ActionListener{  
    JLabel l1,l2,l3;
    JTextField tf1,tf2,tf3;  
    JButton b1,b2,b3,b4;  
    Textfielddemo(){  
        JFrame f= new JFrame(); 
        l1=new JLabel("Number 1");
        l1.setBounds(50,50,150,20);  
        l2=new JLabel("Number 2");
        l2.setBounds(50,100,150,20);  
        l3=new JLabel("Result");
        l3.setBounds(50,150,150,20); 
        tf1=new JTextField();  
        tf1.setBounds(200,50,150,20);  
        tf2=new JTextField();  
        tf2.setBounds(200,100,150,20);  
        tf3=new JTextField();  
        tf3.setBounds(200,150,150,20);  
        tf3.setEditable(false);   
        b1=new JButton("+");  
        b1.setBounds(50,200,50,50);  
        b2=new JButton("-");  
        b2.setBounds(120,200,50,50); 
        b3=new JButton("*");  
        b3.setBounds(190,200,50,50); 
        b4=new JButton("/");  
        b4.setBounds(260,200,50,50); 
        b1.addActionListener(this);  
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        b4.addActionListener(this); 
        f.add(l1); f.add(l2); f.add(l3);
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);  f.add(b3);f.add(b4);
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        
        if(e.getSource()==b1){  
            c=a+b;  
        }else if(e.getSource()==b2){  
            c=a-b;  
        } 
        else if(e.getSource()==b3){  
            c=a*b;  
        }  
        else if(e.getSource()==b4){  
            c=a/b;  
        }  
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
public static void main(String[] args) {  
    new Textfielddemo();  
} }  