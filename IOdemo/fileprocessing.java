/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class fileprocessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream fs=new FileInputStream("C:\\Users\\HP\\Documents\\NetBeansProjects\\javaprogram\\src\\IOStreamProgram\\one");
        //FileOutputStream fs1=new FileOutputStream("C:\\Users\\HP\\Documents\\NetBeansProjects\\javaprogram\\src\\IOStreamProgram\\two");
        int read,count=0;
        while((read=fs.read())!=-1)
        {
            //if(read==10) // 10 ---> newline
            //if((char)read=='a'||(char)read=='e'||(char)read=='i'||(char)read=='o'||(char)read=='u')
            if((char)read==' '||(char)read=='.')  
            count++;
        }
        System.out.println("no of words-->"+count);
        fs.close();
        //fs1.close();
    }
    
}
