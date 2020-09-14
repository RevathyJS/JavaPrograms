/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author HP
 */
public class stringindexdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="welcome to oops class";
        try
        {
        System.out.println(s.substring(5, 50));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
