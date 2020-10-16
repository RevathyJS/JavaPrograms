
package layout;


import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author HP
 */
public class borderlay {

    public static void main(String[] args) {
       new borderdemo();
    }
    
}
class borderdemo extends JFrame
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    borderdemo()
    {
        
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        //add(b1,BorderLayout.PAGE_END);
        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.CENTER);
        add(b4,BorderLayout.NORTH);
        add(b5,BorderLayout.SOUTH);
        add(b6,BorderLayout.WEST);
        //add(b7,BorderLayout.PAGE_START);
        //add(b8,BorderLayout.LINE_START);
        setSize(400,400);
       // setLayout(new BorderLayout());
       // setLayout(new FlowLayout(FlowLayout.RIGHT));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        
    }
}