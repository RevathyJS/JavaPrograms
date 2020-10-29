
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import sun.audio.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Sound extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    JButton b1;
    Sound()
    {
    b1=new JButton("Click me");
    b1.setBounds(150,150,100,40);
    add(b1);
   
    b1.addActionListener(this);
    setSize(600,400);
    setLayout(null);
    setVisible(true);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        music();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Sound();
    }
    public static void music()
    {
        AudioPlayer mgp=AudioPlayer.player;
        AudioStream bgm;
        AudioData md;
        ContinuousAudioDataStream loop=null;
        try
        {
            bgm = new AudioStream(new FileInputStream("C:\\Users\\HP\\Downloads\\CantinaBand3.wav"));
            md = bgm.getData();
            loop =new ContinuousAudioDataStream(md);
        }
        catch(IOException e)
        {
            
        }
        mgp.start(loop);
    }
}
