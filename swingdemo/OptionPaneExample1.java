/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

/**
 *
 * @author HP
 */
import javax.swing.*;  
import java.awt.event.*;  
public class OptionPaneExample1 extends WindowAdapter{  
JFrame f;  
OptionPaneExample1(){  
    f=new JFrame();   
    f.addWindowListener(this);  
    f.setSize(300, 300);  
    f.setLayout(null);  
    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
    f.setVisible(true);  
}  
public void windowClosing(WindowEvent e) {  
    int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
if(a==JOptionPane.YES_OPTION){  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}  
}  
public static void main(String[] args) {  
    new  OptionPaneExample1();  
}     
}  