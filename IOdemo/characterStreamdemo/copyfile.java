/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterStreamdemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class copyfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileReader fd=new FileReader("C:\\Users\\HP\\Documents\\NetBeansProjects\\javaprogram\\src\\characterStreamdemo\\char1");
        FileWriter fw=new FileWriter("C:\\Users\\HP\\Documents\\NetBeansProjects\\javaprogram\\src\\characterStreamdemo\\char2");
        
        int read;
        while((read=fd.read())!=-1)
            fw.write(read);
        
        fd.close();
        fw.close();
        
        
        // abc.txt file1.java => . => int len=charAt('.')[3] => substring(len+1)
        
        
        
        
        
        
        
    }
    
}
