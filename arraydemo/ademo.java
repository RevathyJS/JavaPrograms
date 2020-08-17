/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

/**
 *
 * @author HP
 */
public class ademo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        searchdemo obj=new searchdemo();
        int a[]={2,5,7,8,9,4,3,1,10};
        System.out.println(a.length);
        obj.search(a, 17);
    }
    
}
class searchdemo
{
    boolean flag=false;
    void search(int b[],int key)
    {
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==key)
            {
                flag=true;
            }
        }
        if(flag)
            System.out.println("Element Present");
        else
            System.out.println("Element not Present");
    }
}