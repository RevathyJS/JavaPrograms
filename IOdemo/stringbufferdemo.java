/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;
import java.io.*;
/**
 *
 * @author HP
 */
public class stringbufferdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        String str="oops class";
        StringBufferInputStream sb=new StringBufferInputStream(str);
        int read;
        
        while((read=sb.read())!=-1)
            System.out.print((char)read);
         
         
        
    }
    
}
