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
        StringBuffer s=new StringBuffer("jjjjdfgdhfgd djfhkdjfh jdfhdkf");
        System.out.println(s.length());//30
        System.out.println(s.capacity());//30+16
        s.ensureCapacity(150);//150[30+120]
        System.out.println(s.capacity());//150
        s.setLength(5);//5
        System.out.println(s);
        System.out.println(s.capacity());//150
        
        System.out.println(s.charAt(1));
        s.setCharAt(1, 'w');
        System.out.println(s);
        s= s.append("sin(").append(90).append(")");
        System.out.println(s);
        s=s.insert(5,"oops");
        System.out.println(s);
        s.delete(5, 8);
        System.out.println(s.deleteCharAt(0));
       
    
}
}