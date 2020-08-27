/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectcloning;

/**
 *
 * @author HP
 */
public class deepcopy {
 public static void main(String[] args) {
        // TODO code application logic here
        deep obj=new deep();
        deep obj1=new deep();
        obj1.x=obj.x;
        obj1.y=obj.y;
        System.out.println(obj);
        System.out.println(obj1);
        obj1.x=90;
        System.out.println(obj);
        System.out.println(obj1);
                
    }
    
}
class deep
{
    int x=10,y=40;
    @Override
    public String toString()
    {
         return "X:"+x+"\tY:"+y;
    }
}
