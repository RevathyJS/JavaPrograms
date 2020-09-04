/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylistdemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
/**
 *
 * @author HP
 */
public class lambdademo {
    /**
     * @param args the command line arguments
     */
    Predicate<Integer> obj;
        public static void main(String[] args) {
        // TODO code application logic here  
        demo obj=(int i,double j)-> 
        {
            System.out.println(i);
            System.out.println(j);
        };
             
        
        obj.display(10,10.90);
        // lambda expression () -> expression[set of statements]
        ArrayList<String> list=new ArrayList<>();
        list.add("alim");
        list.add("dharwin");
        list.add("barath");
        list.add("Jyothi");
        list.removeIf( s -> s.startsWith("i"));
        System.out.println(list);
        
            
    }
}
interface demo
{
    void display(int i,double j);
}

