/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterStreamdemo;
import java.io.*;
/**
 *
 * @author HP
 */
public class inputstreamdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader bs=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name and rollno");
        String name=bs.readLine();
        int rolno=Integer.parseInt(bs.readLine());
        float ff=Float.parseFloat(bs.readLine());
        System.out.println(name+"...."+rolno);
    }
    
}
