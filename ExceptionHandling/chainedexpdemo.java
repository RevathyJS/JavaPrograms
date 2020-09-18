/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author HP
 */
public class chainedexpdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        batch b = new batch();
        student std = null;
        try {
            student s = findstudent(b, std);
            //System.out.println(s.id + "...." + s.name);
        } catch (studentnotfoundexception e) {
            System.out.println("Exception:" + e);
            System.out.println(e.getCause());
        }
    }

    static student findstudent(batch b, student s) throws studentnotfoundexception {
        try {
            return b.getstudent(s);
        } catch (NullPointerException e) {
            throw new studentnotfoundexception("student not found",e);
        }
    }

}

class student {

    int id;
    String name;

    student(int i, String n) {
        id = i;
        name = n;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }
}

class batch {

    student[] students;
    int studentcount;

    batch() {
        students = new student[4];
        students[0] = new student(1, "aaa");
        students[1] = new student(2, "bbb");
        students[2] = new student(3, "ccc");
        students[3] = new student(4, "ddd");

        studentcount = 4;
    }

    student getstudent(student std)throws studentnotfoundexception {
        for (int i = 0; i < studentcount; i++) {
            if (students[i].getid() == std.getid() && students[i].getname().equals(std.getname())) {
                return std;
            }
        }
        return null;
    }
}

class studentnotfoundexception extends Exception {

    studentnotfoundexception(String msg,Throwable clause) {
        super(msg,clause);
    }
}
