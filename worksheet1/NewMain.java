package worksheet1;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the stack size");
        int n=o.nextInt();
        char s;
        stack obj=new stack(n);
        do
        {
            System.out.println("Enter the chioce");
            int c=o.nextInt();
            switch(c)
            {
                case 1:if(!obj.isfull())
                       {
                           System.out.println("Enter the element to insert");
                           int i=o.nextInt();
                           obj.push(i);
                       }
                        else
                            System.out.println("Stack full");
                       break;
                case 2:if(!obj.isempty())
                        {
                             int i=obj.pop();
                             System.out.println("Popped Element"+i);
                        }
                        else
                            System.out.println("Stack Empty");
                        break;
                case 3:
                        System.out.println("Stack Elements");
                        obj.display();
                        break;
                default:
                    System.out.println("Enter 1 to 3");
                    break;
            }
            System.out.println("Do u want to continue");
            s=o.next().charAt(0);
        }while(s=='y'||s=='Y');
        
       }
}
class stack
{
    int top=-1;
    int max;
    int a[];
    stack(int n)
    {
        max=n;
        a=new int[max];
    }
    void push(int n)
    {
        a[++top]=n;
    }
    int pop()
    {
        return a[top--];
    }
    boolean isempty()
    {
        return top==-1;
    }
    boolean isfull()
    {
        return top==max-1;
    }
    void display()
    {
        for(int i=top;i>=0;i--)
            System.out.println(a[i]);
    }
}