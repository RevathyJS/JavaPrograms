/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author HP
 */
public class check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sss obj=new sss();
        obj.display();
    }
    
}
class snj
{
    void display()
    {
        System.out.println("snj");
        
    }
    
}
class sss
{
    void display()
    {
        snj obj=new snj();
        obj.display();
    }
}