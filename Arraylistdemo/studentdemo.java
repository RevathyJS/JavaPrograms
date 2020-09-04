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
public class studentdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s1=new student("bbb",100);
        student s2=new student("aaa",90);
        ArrayList<student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(0,new student("ccc",70));
        Collections.sort(list,new marksort());
        System.out.println(list);
        Collections.sort(list,new namesort());
        System.out.println(list);
    }
    
}
class student
{
    String name;
    double mark;
    student(String n,double m)
    {
        name=n;
        mark=m;
    }
    public String toString()   
    {
        return "\nName:"+name+"\tMark:"+mark;
    }
}
class marksort implements Comparator<student>
{
    public int compare(student s1,student s2)
    { 
        System.out.println(s1.mark+"..."+s2.mark);
        return (int)(s2.mark-s1.mark);// +ve -ve
    }
}
class namesort implements Comparator<student>
{
    public int compare(student s1,student s2)
    { 
        System.out.println(s1.name+"..."+s2.name);
        return s2.name.compareTo(s1.name);// +ve -ve
    }
}