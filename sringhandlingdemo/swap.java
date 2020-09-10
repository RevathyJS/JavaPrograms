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
public class swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="have a nice day";
        String str1="welcome to oops class";
        str = str + str1; // have a nice daywelcome to oops class[36-21]
        System.out.println(str.length());
        System.out.println(str1.length());
        str1 = str.substring(0, str.length() - str1.length());
        System.out.println(str1.length());
        str =str.substring(str1.length());
        System.out.println("After Swappig:\n"+str +"\n"+ str1);
       
    }
    
}
