/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterStreamdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class filereaderdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       BufferedReader fd=new BufferedReader(new FileReader("C:\\Users\\HP\\Documents\\NetBeansProjects\\javaprogram\\src\\characterStreamdemo\\char1"));
       String read;
       int i=1,count=0;
       String str[];
       while((read=fd.readLine())!=null)// reading one whole line
       {
           /*System.out.println(i+"."+read);
           i++;*/
           /*if(read.contains("programming"))
           {
               System.out.println(read);
           }*/
           System.out.println("Line---->"+read);
           str = read.split(" ");// split one sentence into words depending on space
           System.out.println("No of words-->"+str.length);
           for(i=0;i<str.length;i++) // str.length[array length]in one sentence how many words
           {
               System.out.println(str[i]);
               if(str[i].length()==1)// length of each word
                   count++;
           }
       }
       System.out.println("One letter word---->"+count);
        /*int read,count=1;
       while((read=fd.read())!=-1)// read char by char
        {
            if((char)read=='\n')
                count++;
            
        }
        System.out.print(count);*/
        fd.close();
    }
    
}
