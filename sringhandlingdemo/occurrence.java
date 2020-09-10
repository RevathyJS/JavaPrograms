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
public class occurrence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="have a nice day.oops.class.";
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        int count=0,sent=0,vowel=0;
        char search='a';
        for(char i:c)
        {
            if(i==search)
                count++;
            if(i=='.')
                sent++;
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
                vowel++;
        }
        System.out.println("a occured:"+count+" Times");
        System.out.println("sentence count:"+sent+" Times");
        System.out.println("Vowel count:"+vowel);
    }
    
}
