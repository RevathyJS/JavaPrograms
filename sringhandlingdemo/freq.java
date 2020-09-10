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
public class freq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here'
        String str="have a nice day";
        int len=0,count=0;
        char c[];
        do
        {
            c=str.toCharArray();//15 14 11
            len=c.length;
            count=0;
            for(char i:c)// traverse each char in char array
            {
                if(c[0]==i)//h==h  h==a h==v h==e
                    count++;
            }
            
            System.out.println(c[0]+"::"+count+" Times");
            
            str = str.replace(""+c[0], "");// delete my first char
            
            System.out.println(str);
        }while(len!=1);
    }
    
}
