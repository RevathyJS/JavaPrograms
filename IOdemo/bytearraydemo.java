/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class bytearraydemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="oops class";
        byte b[]=str.getBytes();
        try
        {
        ByteArrayInputStream bs=new ByteArrayInputStream(b);
        int read;
        while((read=bs.read())!=-1)// read one byte at a time
        {
            System.out.print((char)read);
        }
        System.out.println();
        bs.reset();// going to my first position in file
        byte b1[]=new byte[15];// 0 1 2 3 4 5 6 7 8 9
        bs.read(b1);// byte array, offset[from which u r storing,length)
        for(byte b2:b1)
            System.out.println((char)b2);    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
