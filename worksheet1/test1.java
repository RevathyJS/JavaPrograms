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
class Parent {  } 
class Child extends Parent { } 
  
public class test1 
{ 
    public static void main(String[] args) 
    { 
        Child pobj = new Child(); 
        if (pobj instanceof Parent) 
           System.out.println("pobj is instance of Child"); 
        else
           System.out.println("pobj is NOT instance of Child"); 
    } 
} 
