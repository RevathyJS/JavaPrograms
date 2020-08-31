/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HP
 */
public class test 
{
    
    public static void main(String arg[])
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("raj");
        list.add("anu");
        list.add("bala");
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        list.removeIf(e -> e.endsWith("a"));
        System.out.println(list);
        list.replaceAll(e->e.toUpperCase());
        System.out.println(list);
       /* for(String i:list)
        {
            System.out.println(i);
        }*/
        list.forEach(i -> System.out.println(i));
        //list.f
    }
}
