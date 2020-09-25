/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class readfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Documents\\NetBeansProjects\\javaprogram\\src\\ExceptionHandling\\ChainedException.java");
            
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            
            fis.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
