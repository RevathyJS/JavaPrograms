/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inh;

/**
 * polymorphism -> compile time[method overloading] or run time[method overriding]
 * @author HP
 */
public class overloaddemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        art obj=new art();
        art obj1=new art("sss");
        obj.add(2, 3);
        obj.add(2, 4, 5);
        obj.add("aaa", "vvv");
    }
    
}
class art
{
    art()
    {
        System.out.println("CSE");
    }
    art(String a)
    {
        System.out.println(a);
    }
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
        
    }
    void add(String a,String b)
    {
        System.out.println(a+b);
    }
}