/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterStreamdemo;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class filewriterdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileWriter fw=new FileWriter("C:\\Users\\HP\\Documents\\NetBeansProjects\\javaprogram\\src\\characterStreamdemo\\newfile");
        String str="object oriented programming";
        fw.write(str);
        fw.write(97);
        char c[]=str.toCharArray();
        fw.write(c);
        fw.close();
    }
    
}
