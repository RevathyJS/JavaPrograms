/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;  
class ScrollBarExample implements AdjustmentListener  
{ 
    JFrame f;
    JScrollBar s,s1,s2;
    
ScrollBarExample(){  
f= new JFrame("Scrollbar Example");
s=new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 255);  
s1=new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 255); 
s2=new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 255); 
s.setBounds(100,100, 30,100);  
s1.setBounds(140,100, 30,100);
s2.setBounds(180,100, 30,100);
s.addAdjustmentListener(this);
s1.addAdjustmentListener(this);
s2.addAdjustmentListener(this);
f.add(s);  
f.add(s1); 
f.add(s2); 

f.setSize(400,400);  
f.setLayout(null);  
f.setVisible(true); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
public void adjustmentValueChanged(AdjustmentEvent ae)
{
    int red= s.getValue();
    int green = s1.getValue();
    int blue =s2.getValue();
    System.out.println(red);
    f.getContentPane().setBackground(new Color(red,green,blue));
   
}
public static void main(String args[])  
{  
new ScrollBarExample();  
}}  