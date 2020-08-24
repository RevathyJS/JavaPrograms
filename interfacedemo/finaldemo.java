/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceprogram;

/**
 *
 * @author HP
 */
public class finaldemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    }
    
}
final class test // cant inherit
{
    final int a=10; // value cannot be changed
    final void display() // cant override
    {
        //a= a+10;
        System.out.println(a);
    }
}
/*class dervived extends test
{
    //void display()
    {
        
    }
}*/