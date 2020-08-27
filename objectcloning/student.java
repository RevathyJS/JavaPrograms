/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Define a class called student with the following attributes 
(i)Roll number  (ii) Name  (iii)Age (iv) Weight (V) Height and (vi) mark	
Write suitable constructor and method to display the details of student object. 
In the main method create 5 student objects and display the name and roll no of the student	
(i) Who are 19 years old (ii) More with weight above 90 Kg     

 */
package objectcloning;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj1=new Scanner(System.in);
        studetails obj[]=new studetails[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter student "+(i+1)+" Details");
            String rollno=obj1.next();
            String name=obj1.next();
            int age=obj1.nextInt();
            float height=obj1.nextFloat();
            float weight=obj1.nextFloat();
            float mark=obj1.nextFloat();
            obj[i]=new studetails(rollno,name,age,height,weight,mark);
        }
        System.out.println("Students having age 19 and weight above 90kg");
         for(int i=0;i<5;i++)
        {
            if(obj[i].age==19 && obj[i].weight>90)
            {
                System.out.println("Name:"+obj[i].name+"\t Rollno:"+obj[i].rollno);
            }
        }
        
    }
    
}
class studetails
{
    String rollno,name;
    int age;
    float weight,height,mark;
    studetails(String r,String n,int a,float f,float f1,float f2)
    {
        rollno =r;
        name =n;
        age=a;
        height=f;
        weight=f1;
        mark=f2;
    }
}