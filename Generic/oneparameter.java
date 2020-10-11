/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class oneparameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       sample<Integer> obj=new sample<>(100);
       System.out.println(obj.getObject());
       obj.show();
       
       sample<Double> obj1=new sample<>(100.00);
       System.out.println(obj1.getObject());
       obj1.show();
       
       sample<Character> obj2=new sample<>('c');
       System.out.println(obj2.getObject());
       obj2.show();
       
       sample<String> obj3=new sample<>("oops");
       System.out.println(obj3.getObject());
       obj3.show();
       
       student s=new student("raji",100);
       sample<student> obj4=new sample<>(s);
       System.out.println(obj4.getObject());
       obj4.show();
      
    }
    
}
class sample<T>
{
    T value; // int a
    sample(T value) // sample(int a)
    {
        this.value= value;
    }
    T getObject() // int getObject()
    {
        return value;
    }
    public void show()
    {
        System.out.println(value.getClass().getName());
    }
}
class student
{
    String name;
    int rollno;

    public student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", rollno=" + rollno + '}';
    }
    
}