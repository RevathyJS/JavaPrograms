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
public class printdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer num[]={2,3,4,5,6,7,8,9,10};
        test2<Integer> obj=new test2<>(num);
        obj.display();
        
        Character c[]={'j','a','v','a'};
        test2<Character> obj1=new test2<>(c);
        obj1.display();
        
        student s[]=new student[3];
        s[0]=new student("aaa",100);
        s[1]=new student("bbb",101);
        s[2]=new student("ccc",102);
        
        test2<student> obj2=new test2<>(s);
        obj2.display();
        
         
    }
    
}
class test2<T>
{
    T[] value;

    public test2(T[] value) {
        this.value = value;
    }
    
    public void display()
    {
        for(int i=0;i<value.length;i++)
        {
            System.out.println(value[i]);
        }
    }
}