/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 *
 * @author HP
 */
public class pipeddemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        PipedInputStream in=new PipedInputStream();
        PipedOutputStream out=new PipedOutputStream();
        in.connect(out);
        //out.connect(in);
        String str="java programming";
        byte b[]=str.getBytes();
        for(byte i: b)
        {
        out.write(i);
        System.out.print((char)in.read());
        }
        in.close();
        out.close();
    }
    
}
