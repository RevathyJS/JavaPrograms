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
public class shallowcopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        shallow obj=new shallow();
        shallow obj1=obj;
        System.out.println(obj);
        System.out.println(obj1);
        obj1.x=90;
        System.out.println(obj);
        System.out.println(obj1);
                
    }
    
}
class shallow
{
    int x=10,y=40;
    @Override
    public String toString()
    {
         return "X:"+x+"\tY:"+y;
    }
}