/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterStreamdemo;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class chardemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String str="java programming";
        char c[]=str.toCharArray();
        // char c[]={'a','b','c'};
       CharArrayReader ca=new CharArrayReader(c);
       int read;
       char c1[]=new char[8];
       //ca.read(c1); // from object ca content will be moved on to c1
       ca.read(c1, 3, 5);
       for(char r:c1)
           System.out.println(r);
      /* while((read=ca.read())!=-1)// reading char by char
           System.out.print((char)read);*/
       
      /* ca.reset(); // move to first position
       ca.skip(5); //
       while((read=ca.read())!=-1)
           System.out.print((char)read);*/
    }
    
}
