/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterStreamdemo;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class charwriterdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String str="oops class";
        CharArrayWriter cw=new CharArrayWriter();
        FileWriter fw=new FileWriter("C:\\Users\\HP\\Documents\\NetBeansProjects\\javaprogram\\src\\characterStreamdemo\\one");
        cw.write(str,6,4);        
        System.out.println(cw);        
        char c[]={'a','b','c'};
        cw.write(c,1,1);
        System.out.println(cw);
        cw.writeTo(fw);// cw ==> fw
        fw.flush(); // clear the stream
    }
    
}
