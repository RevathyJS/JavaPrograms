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
public class empldemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee e1=new employee("raj",20000);
        //System.out.println(e1);
        ArrayList<employee> list=new ArrayList<>();
        list.add(e1);
        list.add(new employee("rosyla",25000));
        list.add(new employee("karthick",30000));
        list.add(new employee("AAA",10000));
        list.add(new employee("FFF",40000));
        System.out.println(list);
        Collections.sort(list,new namesort());
        System.out.println(list);
        Collections.sort(list,new salarysort());
        System.out.println(list);
    }
    
}
class employee
{
    String name;
    double salary;
    employee(String n,double s)
    {
        name=n;
        salary=s;
    }
    public String toString()
    {
        return "\nEmployee Name:"+name+"\tSalary:"+salary;
    }
}
class namesort implements Comparator<employee>
{
    @Override
    public int compare(employee e1,employee e2)
    {
        System.out.println(e1.name+"----"+e2.name);
        return e2.name.compareTo(e1.name);// positive / negative
    }
}
class salarysort implements Comparator<employee>
{
    @Override
    public int compare(employee e1,employee e2)
    {
        return (int)(e2.salary-e1.salary);// positive / negative
    }
}