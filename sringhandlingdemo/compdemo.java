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
public class compdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // String comparison
        String s="oops class oops jjj";
        String s1="oops";
        if(s.equals(s1))
            System.out.println("equal");
        else 
            System.out.println("not equal");
        if(s.equalsIgnoreCase(s1))
            System.out.println("equal");
        else 
            System.out.println("not equal");
        //regionmatches -> source starting location,string 2,string2 starting index,length)
        System.out.println("oops class oops jjj".regionMatches(16, "oops jjjhg", 5, 3));
        System.out.println(s.regionMatches(true,16, "oops JJJhg", 5, 3));//true-ignore case false-consider the case
        System.out.println(s.regionMatches(0, s1, 0, 4));
        
        //starts with
         System.out.println(s.startsWith("oops"));
         System.out.println(s.startsWith("class",15));
         //endswith
         System.out.println(s.endsWith("j"));
         //compareTo
         String s2="abc";// 100
         String s3="def";// 105
         if(s3.compareTo(s2)>0) // -ve[first str< second str]  +ve[first str > second str] 0
          System.out.println("greater");
         else
          System.out.println("lesser");
         
        //indexof  s="oops class oops jjj";
        System.out.println(s.indexOf("oops"));
        System.out.println(s.indexOf("oops",10));
        System.out.println(s.indexOf('s'));
        System.out.println(s.indexOf('s',5));
        
       //lastindexof
       System.out.println(s.lastIndexOf("oops"));
       System.out.println(s.lastIndexOf("oops",10));
       System.out.println(s.lastIndexOf('s'));
       System.out.println(s.lastIndexOf('s',5));
       
       //modifying 
       System.out.println(s.substring(10));
       System.out.println(s.substring(10,14));
       //replace
       System.out.println(s.replace('o', 'r'));// old char, new char
       //concat
       System.out.println(s.concat(s3));
       //trim
       String ss="   \n \t welcome to java";
       System.out.println(ss.trim());
       System.out.println(s.toUpperCase());
       
       String str="welcome:to:oops:class";
                
       String str1[]=str.split(":");
       for(String i:str1)
          System.out.println(i);
         
       System.out.println("welcome to oops class".contains("to"));
    }
    
}
