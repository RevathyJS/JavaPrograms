/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author HP
 */
public class seqdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream f=new FileInputStream("1.txt");
        FileInputStream f1=new FileInputStream("one.txt");
        FileInputStream f2=new FileInputStream("first.txt");
        FileInputStream f3=new FileInputStream("all.txt");
        Vector v=new Vector();
        v.add(f);
        v.add(f1);
        v.add(f2);
        v.add(f3);
        Enumeration e=v.elements();
        SequenceInputStream sq=new SequenceInputStream(e);
        int read;
        while((read=sq.read())!=-1)
            System.out.print((char)read);
        
        sq.close();
        f.close();
        f1.close();
        
    }
    
}
