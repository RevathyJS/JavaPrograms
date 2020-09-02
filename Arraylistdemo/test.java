/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author HP
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("ggga");
        list.add("llla");
        list.add(1,"jjj");
        System.out.println(list);
        ArrayList<String> list1=new ArrayList<>();
        list1.add("yyy");
        list1.add("ppp");
        list.addAll(2,list1);
        //list.remove(0);
        //list.remove("jjj");
        //list.removeAll(list1);
        
        System.out.println(list);
        // Enhanced for loop
       /* for(String i:list)
        {
            if(i.equals("ooo"))
             System.out.println("element found");
            else
              System.out.println("element not found");  
        }*/
      /* Iterator itr=list.iterator();
       while(itr.hasNext()) // [AAA,jjj,ggg,lll] check 
       {
           System.out.println(itr.next());
       }*/
      //list.forEach(s -> System.out.println(s)); // lambda
      //list.removeIf(s -> s.endsWith("a")); // depending on condition
      //list.replaceAll(s -> s.toUpperCase());
      //list.retainAll(list1);
      //list.clear();
      //System.out.println(list.isEmpty());
      //System.out.println(list.get(3));
      // list.set(3, "kkk");
      // System.out.println(list.get(3));
      //Collections.sort(list);
      //Collections.reverse(list);
      Collections.sort(list,Collections.reverseOrder());
      System.out.println(list);
      
      ArrayList<Integer> list2=new ArrayList<>();
      
    }
    
}
