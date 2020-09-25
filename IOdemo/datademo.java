/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class datademo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        DataInputStream ds=new DataInputStream(System.in); // Primitive data
        System.out.println("Enter a number");
        int i=Integer.parseInt(ds.readLine());
        System.out.println(i);
        ds.close();
        DataOutputStream ds1=new DataOutputStream(System.out);
        ds1.write(97);
        String str="oops";
        byte b[]=new byte[4];
        b=str.getBytes();
        ds1.write(b,2,2);
        ds1.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}
