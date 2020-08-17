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
public class singledemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        caladv obj=new caladv();
        System.out.println(obj.add(10,20));
        System.out.println(obj.sub(10,2));
        System.out.println(obj.mul(2,3));
        System.out.println(obj.div(10,2));
        System.out.println(obj.mod(12,10));
        System.out.println(obj.pow(2,3));
        
    }
    
}
class cal
{
    int add(int i,int j)
    {
        return i+j;
    }
    int sub(int i,int j)
    {
        return i-j;
    }
    int mul(int i,int j)
    {
        return i*j;
    }
    int div(int i,int j)
    {
        return i/j;
    }
}
class caladv extends cal
{
    int mod(int i,int j)
    {
        return i%j;
    }
    double pow(int i,int j)
    {
        return Math.pow(i, j);
    }
}