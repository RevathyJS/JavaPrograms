/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

/**
 *
 * @author HP
 */
public class arrmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        minp obj=new minp();
        int a[]={2,5,7,4,9};
        obj.min(a, 10);
    }
    
}
class minp
{
    boolean flag=false;
    void min(int a[],int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                flag=true;
            }
        }
        if(flag==true){
            System.out.println("Element found in array");
        }
        else
        {
            System.out.println("Element not found in array");
        }
    }
}