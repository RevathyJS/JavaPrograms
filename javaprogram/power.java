/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;

public class power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3, p= 2,sum =1;
        
        for(int i=0;i<p;i++)
        {
            sum = sum * n;
        }
        System.out.println("Power of "+ n +"^"+ p+ "..."+ sum);
        System.out.println(Math.pow(n,p));
    }
    
}
