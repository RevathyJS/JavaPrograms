/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.PrintStream;

/**
 *
 * @author HP
 */
public class printdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrintStream ps=new PrintStream(System.out);//primitive data type
        ps.print(100);
        ps.print('c');
        ps.print("oops");
        ps.close();
        
    }
    
}
