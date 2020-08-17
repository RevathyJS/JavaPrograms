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
public class singleinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boxcost bx=new boxcost(10,20,30,200,100);
        System.out.println("Volume"+bx.volume());
        System.out.println("Weight"+bx.weight);
        System.out.println("Cost"+bx.cost);
    }
    
}
class box // super
{
    double height;
    double width;
    double depth;
    double volume()
    {
        return height*width*depth;
    }
}
class boxweight extends box // box+boxweight
{
    double weight;
 
}
class boxcost extends boxweight // box +boxweight +boxcost
{
    double cost;
       boxcost(double h,double d,double w,double w1,double c)
    {
        height = h;
        width =w;
        depth =d;
        weight =w1;
        cost =c;
    }
}