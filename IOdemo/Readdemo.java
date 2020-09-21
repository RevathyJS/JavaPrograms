/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Readdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException {
        // TODO code application logic here
        FileInputStream fis=new FileInputStream("one.txt");
        FileOutputStream obj=new FileOutputStream("abc.txt",true);
        int data=fis.read();
        //System.out.println(data);
        while((data=fis.read())!=-1)
        {
            obj.write(data);
         //System.out.println((char)data);
        }
       
        fis.close();
        obj.close();
    }
    
}
