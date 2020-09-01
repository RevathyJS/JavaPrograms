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
public class manyobj {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        s obj[]=new s[10];// array of objects for the class
        for(int i=0;i<10;i++)
        {
            obj[i]=new s();// creates memory for each object
            obj[i].display();
        }
    } 
}
class s
{
    void display()
    {
        System.out.println("Welcome");
    }
}