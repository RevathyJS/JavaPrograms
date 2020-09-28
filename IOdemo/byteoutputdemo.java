/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class byteoutputdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
       
        FileOutputStream f=new FileOutputStream("C:\\Users\\HP\\Desktop\\one.txt");
        FileOutputStream f1=new FileOutputStream("2.txt");
        FileOutputStream f2=new FileOutputStream("3.txt");
        ByteArrayOutputStream ba=new ByteArrayOutputStream();
        String str="the complete reference in java programming";
        //FileInputStream ff=new FileInputStream("two.txt");
        byte b[]=str.getBytes();
        for(byte b1:b)
            System.out.println(b1);
        ba.write(b);
        //System.out.println(ba);
       
        ba.writeTo(f);
        ba.writeTo(f1);
        ba.writeTo(f2);
        ba.close();
        f.close();
        f1.close();
        f2.close();
       
    }
    
}
