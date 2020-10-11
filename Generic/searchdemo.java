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
public class searchdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer num[]={2,3,4,5,6};
        test4<Integer,Integer> obj=new test4<>();
        obj.search(15, num);
        
        String s[]={"abc","oops","java"};
        test4<String,String> obj1=new test4<>();
        obj1.search("java123", s);
    }
    
}
class test4<T,V>
{
    boolean flag=false;
    
    public  <T,V> void search(T s,V[] value)
    {
        for(int i=0;i<value.length;i++)
        {
            if(s.equals(value[i]))
            {
                flag= true;
                break;
            }
            else
                flag=false;      
        }
        
        if(flag)
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}