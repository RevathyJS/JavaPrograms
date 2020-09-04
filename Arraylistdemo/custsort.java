/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author HP
 */
public class custsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(104);
        obj.add(452);
        obj.add(231);
        obj.add(125);
        Collections.sort(obj,new custom());
        System.out.println(obj);
      }
}

class custom implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        System.out.println(i1+"...."+i2);
        return i1%10-i2%10;
    }
}