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
public class equalsdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     sample2 obj=new sample2();
     sample2 obj1=new sample2();
     obj1.y=90;
     System.out.println(obj);
     System.out.println(obj1);
     if(obj.equals(obj1))
     {
         System.out.println("Equal");
     }
     else
         System.out.println("Not equal");
    }
    
}
class sample2
{
    int x=10,y=10;
}