/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class writefile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f=new File("first.txt");
        String str="Object oriented programming";
        byte b[]=str.getBytes();
        for(byte b1:b)
        {
            System.out.println(b1+"..."+(char)b1);
        }
        try
        {
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(b);
        fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
