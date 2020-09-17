/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class throwsdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Hour & Minute in hh:mm format");
        String s = obj.next();
        try {
            timechecker time = new timechecker(s);
            time.checker();
        } catch (timeexception t) {
            System.out.println(t);
        }
    }
}

class timechecker {

    String time;

    timechecker(String t) {
        time = t;
    }

    void checker() throws timeexception {
        String s[] = time.split(":"); // splitting abc,dcf,bng
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        if (a < 0 || a > 24) {
            throw new timeexception("Invalid Hour" + a);
        }
        if (b < 0 || b > 60) {
            throw new timeexception("Invalid Minute" + b);
        }
        System.out.println("Hour" + a + "\nMinute" + b);
    }
}

class timeexception extends Exception {

    timeexception(String s) {
        super(s);
    }
}
