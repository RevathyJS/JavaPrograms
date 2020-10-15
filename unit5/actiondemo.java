
package unit5;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actiondemo extends Applet implements ActionListener {
TextField tf;  
    public void init() {
    tf=new TextField();  
    //tf.setBounds(60,50,200,20);  
    Button b=new Button("click me");  
    //b.setBounds(50,120,80,30);  
    b.addActionListener(this); 
    
    add(b);
    add(tf);  
    }
public void actionPerformed(ActionEvent ae){  
tf.setText("hello");  
}  
}

