package javaprogram;
import java.util.Scanner;
public class Javaprogram {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter side");
        int a=obj.nextInt();
        int perimeter= 4 * a;
        System.out.println("perimeter of Square..."+perimeter);
    }
    
}
