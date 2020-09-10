/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sringhandlingdemo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class validation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //email : jslr@vcet.ac.in  phone: 1234567890
        String email,phone;
        Scanner obj=new Scanner(System.in);
        email=obj.next();
        phone=obj.next();
        if(email.contains("@") && email.contains("."))
            System.out.println("Valid mail id");
        else
            System.out.println("InValid mail id");
        if((phone.length()==10))
            System.out.println("Valid Phone");
        else
            System.out.println("InValid Phone no");
    }
    
}
