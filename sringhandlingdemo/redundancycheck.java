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
public class redundancycheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="hello world";
        char c[]=str.toCharArray();
        boolean flag;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++)
        {
            flag=false;
            for(int j=i+1;j<c.length;j++)// h =>e,l,l,o, ,w,o,r,l,d
            {
                if(c[i]==c[j])
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
                sb.append(c[i]);
        }
        System.out.println(sb);
    }
    
}
