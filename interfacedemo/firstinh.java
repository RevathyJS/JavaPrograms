/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class firstinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter product code");
        int i=obj.nextInt();
        testint obj1=new testint();
        obj1.getproductdetails(i);
        obj1.getproductprice(i);
    }
    
}
interface prodcode
{
    int tv=101;
    int laptop=102;
    int mobile=103;
}
interface methoddesc
{
    void getproductdetails(int code);
    void getproductprice(int code);
}
class testint implements prodcode,methoddesc
{
    public void getproductdetails(int code)
    {
       switch(code)
       {
           case tv: System.out.println("Sony LED TV");
               break;
           case laptop:
               break;
           case mobile:
               break;
           default:
               break;
       }
    }
     public void getproductprice(int code)
    {
        
    }
}