/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author HP
 */
public class twoparameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test<Integer,Character> obj=new test<>(100,'j');
        System.out.println(obj.getValue());
        System.out.println(obj.getValue1());
        obj.display();
        
        test<Float,Double> obj1=new test<>(100.2f,20.49);
        System.out.println(obj1.getValue());
        System.out.println(obj1.getValue1());
        obj1.display();
    }
    
}
class test<T,V>
{
    T value;
    V value1;

    public test(T v, V v1) {
        value = v;
        value1 = v1;
    }

    public T getValue() {
        return value;
    }

    public V getValue1() {
        return value1;
    }
    
    public void display()
    {
        System.out.println(value.getClass().getName());
        System.out.println(value1.getClass().getName());
    }
}