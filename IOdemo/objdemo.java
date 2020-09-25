/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreamProgram;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author HP
 */
public class objdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        DataInputStream ds=new DataInputStream(System.in);
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("fruit.txt"));
        System.out.println("No of fruits");
        int n= Integer.parseInt(ds.readLine());
        fruit f[]=new fruit[n];
        String name;
        double price;
        for(int i=0;i<n;i++)
        {
            System.out.println("Fruit name");
            name = ds.readLine();
            System.out.println("Fruit Price");
            price = Double.parseDouble(ds.readLine());
            f[i]=new fruit(name,price);
            obj.writeObject(f[i]); // write into the file           
        }
        obj.close();
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("fruit.txt"));
        while(n>0)
        {
            System.out.println(obj1.readObject());
            n--;
        }
        obj1.close();
        
    }
    
}
//fruit => name + price
class fruit implements Serializable
{
    String name;
    double price;
    fruit(String n,double p)
    {
        name =n;
        price =p;
    }
    public String toString()
    {
        return "Fruit Name:"+name+"Price:"+price;
    }
}