/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
/**
 *
 * @author HP
 */
public class singleinheritance {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boxweight bw=new boxweight(10,20,30,15);
       System.out.println(bw.volume());
       boxweight bw1=new boxweight(10.5,40,30,15.8);
       System.out.println(bw1.volume());
        System.out.println(bw.width);
    } 
}
class box
{
    double width;
    double height;
    double depth;
    private String color;
    box()
    {
         width=29;
         height=19;
         depth=99;
    }
    box(double length)
    {
        width=height=depth=length;
    }
    box(double w,double h,double d)
    {
         width=w;
         height=h;
         depth=d;
    }
   double volume()
   {
       return width*height*depth;
   }
}
class boxweight extends box
{
    double weight;
    boxweight(double w,double h,double d,double dw)
    {
         width=w;
         height=h;
         depth=d;
    }
}