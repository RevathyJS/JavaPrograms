/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

class Bike{  
  void run(){System.out.println("running");}  
}  
public class Splender extends Bike{  
  @Override
  void run(){System.out.println("running safely with 60km");}  
  public static void main(String args[]){  
    Bike b = new Splender();//upcasting  
    b.run();  
  }  
}  
