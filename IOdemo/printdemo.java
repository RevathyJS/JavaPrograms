/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author HP
 */
public class printdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //PrintStream ps=new PrintStream(System.out);//primitive data type
        PrintStream ps=new PrintStream(new FileOutputStream("C:\\Users\\HP\\Documents\\NetBeansProjects\\javaprogram\\src\\IOStreamProgram\\printfile"));
        ps.print(100);
        ps.print("\n");
        ps.print('c'); 
        ps.print("\n");
        ps.print("oops");
        ps.print("\n");
        ps.close();
        
    }
    
}
