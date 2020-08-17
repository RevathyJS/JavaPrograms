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
public class overridingdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sbi s=new sbi();
        System.out.println(s.getrateofinterest());
        iob s1=new iob();
        System.out.println(s1.getrateofinterest());
        tmb s2=new tmb();
        System.out.println(s2.getrateofinterest());
        
        
        bank b; // reference /// dynamic method invocation(or) dispatch
        b=new sbi(); // memory created
        System.out.println(b.getrateofinterest());
        b=new iob();
        System.out.println(b.getrateofinterest());
        b=new tmb();
        System.out.println(b.getrateofinterest());
    }
    
}
class bank //super
{
    int getrateofinterest()
    {
        return 0;
    }
}
class sbi extends bank
{
    @Override
    int getrateofinterest()
    {
        return 8;
    }
}
class iob extends bank
{
    @Override
    int getrateofinterest()
    {
        return 7;
    }
}
class tmb extends bank
{
    int getrateofinterest()
    {
        return 6;
    }
}