/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class datafile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        DataOutputStream ds=new DataOutputStream(new FileOutputStream("all.txt"));
        ds.writeInt(1000);
        ds.writeChar('c');
        ds.writeUTF("java");// Ascii code + unicode
        ds.close();
        
        DataInputStream ds1=new DataInputStream(new FileInputStream("all.txt"));
        System.out.println(ds1.readInt());
        System.out.println(ds1.readChar());
        System.out.println(ds1.readUTF());// Ascii code + unicode
        ds1.close();
        }
        catch(IOException e)
        {
            System.out.print(e);
        }
    }
    
}
