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
public class sample1 {

    /**
     * @param args the command line arguments
     * Develop a Java application with Employee class with Emp_name, Emp_id, Address, Mail_id, Mobile_no as members. Inherit the classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class. Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net salary.
     */
    public static void main(String[] args) {
     professor pf=new professor(1000);
     pf.read();
     pf.salarycal();
     pf.display();
    }
    
}
class employee
{
    String name;
    int empid;
    double da;
    double hra;
    double pf;
    double staffclub;
    double basic_salary;
    
    void read()
    {
        name ="AAA";
        empid =1001;
    }
    void salarycal()
    {
       da=basic_salary*0.97;
       hra=basic_salary*0.10;
       pf=basic_salary*0.12;
       staffclub=basic_salary*0.01;
    }
    void display()
    {
        System.out.println("Name"+name+"Empid"+empid+"DA"+da);
    }
}
class professor extends employee
{
    //double basicsalary;
    professor(double bs)
    {
        basic_salary=bs;
    }
    void salarycal()
    {
        super.salarycal();
    }
    void display()
    {
        super.display();
    }
}