/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/**
 *
 * @author HP
 */
public class intdemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>(7); // 10,3,45,78,2,90
       list.add(10);
       list.add(3);
       list.add(45);
       list.add(78);
       list.add(2);
       list.add(90);
       list.add(45);
       list.add(2,60); // index
       System.out.println(list);
       ArrayList<Integer> list1=new ArrayList<>();
       list1.add(5);
       list1.add(7);
       list1.add(6);
       list.addAll(list1); // add list 
       System.out.println(list);
       //list1.remove(1); // remove particular element 
       //list.removeAll(list1);// remove whole list
       //list.removeIf(e -> e<10);// lambda (e) -> expresion
       // list.retainAll(list1);
       //list.replaceAll(e->e*2);
       // System.out.println("Updated list"+list);
       // System.out.println(list.get(5));
       //list.set(5, 100);
       //System.out.println(list.get(5));
       //list.clear();
       //System.out.println(list.isEmpty());
        Collections.sort(list,Collections.reverseOrder());
       //Collections.reverse(list);
       System.out.println(list);
       
    }
    
}
/*
123
101
239
340
784
*/