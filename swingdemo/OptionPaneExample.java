/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;
import javax.swing.*;  
public class OptionPaneExample {  
JFrame f;  
OptionPaneExample(){  
    f=new JFrame();  
   // JOptionPane.showMessageDialog(f,"Hello, Welcome to Java Class."); 
   // JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
      String name=JOptionPane.showInputDialog(f,"Enter Name");    
    //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
public static void main(String[] args) {  
    new OptionPaneExample();  
}  
}  