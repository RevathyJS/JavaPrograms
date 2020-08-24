/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

/**
 *
 * @author HP
 */
public class nestedint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test1 obj=new test1();
        obj.display();
        obj.show();
        
        int1 obj1=new test1();
        obj1.display();
        
        int1.int2 obj2= new test1();
        obj2.show();
     
    }
    
}
interface int1
{
    void display();
    interface int2
    {
        void show();
    }
    
}

class test1 implements int1,int1.int2
{
    public void display()
    {
        System.out.println("First interface");
    }
    public void show()
    {
        System.out.println("Nested interface");
    }
}