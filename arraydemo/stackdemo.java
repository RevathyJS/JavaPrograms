/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class stackdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int max=s.nextInt();
        stack obj=new stack(max);
        int choice,i;
        char ch;
        
        do
        {
        System.out.println("1.Push\n2.Pop\n3.Display");
        choice =s.nextInt();
        switch(choice)
        {
            case 1:  if(!obj.isfull())
                {
                System.out.println("Enter element to insert");
                i=s.nextInt();
                obj.push(i);
                }
                else
                System.out.println("Stack is full");
            break;
            case 2: 
                if(!obj.isempty())
                {
                System.out.println("Deleted Element"+obj.pop());
                }
                else
                System.out.println("Stack is Empty");
                
            break;
            case 3:
                obj.display();
            break;
            default:
                System.out.println("Enter option from 1 to 3");
            break;
        }
        System.out.println("Do u want to continue");
        ch=s.next().charAt(0);
        }while(ch=='y'||ch=='Y');
    }
    
}
class stack // LIFO
{
    int top=-1;
    int a[];
    int max;
    stack(int n)
    {
        max=n;
        a=new int[max];
    }
    void push(int i)
    {
        a[++top]=i; // top=-1 // top= 0//a[0] =9
    }
    int pop()
    {
        return a[top--]; //top=0// a[0]=9 //top=-1
    }
    boolean isfull()
    {
        return top==max-1; // 0,1,2,3,4
    }
    boolean isempty()
    {
        return top==-1;
    }
    void display()
    {
        for(int i=top;i>=0;i--)
            System.out.println(a[i]);
    }
}