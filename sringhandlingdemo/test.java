/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sringhandlingdemo;

/**
 *
 * @author HP
 */
public class test extends Object{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="OOPS"; // String Literal
        String s1="OOPS";
        
        if(s==s1)       
            System.out.println("equal");
        else
            System.out.println("Not equal");
        System.out.println(s.getClass());
    }
    
}
