/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class writedemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileOutputStream obj=new FileOutputStream("abc.txt",true);
        byte b[]={97,98,99,100,101,102};
        obj.write(b);
        obj.close();
        
    }
    
}
