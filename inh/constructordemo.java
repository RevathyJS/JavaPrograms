/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inh;

/**
 *
 * @author HP
 */
public class constructordemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                a obj=new a();
    }
    
}
class a
{
    a()
    {
        System.out.println("Class A");
    }
}
class b extends a
{
    b()
    {
        System.out.println("Class B");
    }
}
class c extends b
{
    c()
    {
        System.out.println("Class C");
    }
}