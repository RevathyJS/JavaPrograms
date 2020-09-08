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
public class creationdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s=new String();
        s="OOPS";
        String s1=new String("JAVA");
        char c[]={'o','o','p','s'};// 0 1 2 3
        String s2=new String(c,2,2);// char array, begin index, no of chars
        System.out.println(s2);
        byte b[]={65,66,67,68};
        String s3=new String(b,0,2);//byte array,begin index, no of bytes
        System.out.println(s3);
        String s4=new String(s);
        
        // String concat
        System.out.println("Add:"+(1+2));
        
        //Extraction
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        
        // Reverse string  oops => spoo
        /*for(int i=s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));*/
        //getchars(start,end,char[],targetindex)
        String s5="welcome to oops class";
        char c1[]={'j','l','l','p','j','u','h'};
        
        s5.getChars(0, 2, c1, 4);
        for(char i: c1)
        System.out.print(i);
        
       /* byte b1[]=new byte[10];
        b1=s5.getBytes();
        for(byte i: b1)
        System.out.print((char)i);*/
        
        char c2[]=new char[20];
        c2=s5.toCharArray();
        for(char i: c2)
        System.out.print(i);
    }
    
}
