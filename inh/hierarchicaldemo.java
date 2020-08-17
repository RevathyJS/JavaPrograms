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
public class hierarchicaldemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student st=new student("AAA","19cse01","CSE");
        System.out.println(st);
        staff s=new staff("BBB","cse1990","CSE");
        System.out.println(s);
        s.display();
    }
    
}
class clg //Super
{
    String clgname="VCET";
    int clgcode=9131;
    void display()
    {
        System.out.println("College Info");
    }
}
class student extends clg //sub
{
    String sname;
    String rollno;
    String dept;
    student(String s,String r,String d)
    {
        sname =s;
        rollno =r;
        dept=d;
    }
    public String toString()
    {
        return "Student Details \n\n College Name:"+clgname+"\nCollege Code:"+clgcode+"\nStudent Name:"+sname+"\nRoll No:"+rollno+"\nDepartment:"+dept;
    }
    
}
class staff extends clg // sub
{
    String sname;
    String sid;
    String dept;
    staff(String s,String r,String d)
    {
        sname =s;
        sid =r;
        dept=d;
    }
    public String toString()
    {
        return "Staff Details \n\n College Name:"+clgname+"\nCollege Code:"+clgcode+"\nStudent Name:"+sname+"\nStaff ID:"+sid+"\nDepartment:"+dept;
    }
    
}