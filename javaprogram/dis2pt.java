/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;

/**
 *
 * @author HP
 */
public class dis2pt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x1 = 3, x2=4,y1=7,y2=9;
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println(distance);
        
    }
    
}
