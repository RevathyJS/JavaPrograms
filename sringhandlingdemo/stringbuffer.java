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
public class stringbuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // default constructor
        StringBuffer obj=new StringBuffer("oops class");
        System.out.println(obj.length());
        System.out.println(obj.capacity());//16+4
        obj.ensureCapacity(150);
        System.out.println(obj.capacity());
        obj.setLength(4);
        System.out.println(obj);
        System.out.println(obj.capacity());
        //charAt(index)
        System.out.println(obj.charAt(2));
        //setCharAt(index,char)
        obj.setCharAt(2, 'd');
        System.out.println(obj.charAt(2));
        char c[]=new char[10];
        obj.getChars(0, 2, c, 0);
        /*for(char i:c)
            System.out.println(i);*/
        //append
        obj.append("sin(").append(90).append(")");
        System.out.println(obj);
        //insert
        obj.insert(2,"kkk");
        //System.out.println(obj.reverse());
        //delete
        obj.delete(2, 6);
        System.out.println(obj.deleteCharAt(0));
        //replace
        obj=obj.replace(0, 3, "hhh");
        System.out.println(obj);
        // substring 
        System.out.println(obj.substring(2));
        System.out.println(obj.substring(2,4));
        StringBuilder obj1=new StringBuilder("have a nice day");
        System.out.println(obj1);
        
}
}