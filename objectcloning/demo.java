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
public class demo {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws CloneNotSupportedException
    {
      sample obj=new sample(); // time taken 
      sample obj1=(sample)obj.clone(); // fast 
      System.out.println(obj);
      obj1.x=90;
      System.out.println(obj1);
    }
}
class sample implements Cloneable
{
    int x=10,y=20;
    @Override
    public String toString()
    {
        return "X:"+x+"\tY:"+y;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}