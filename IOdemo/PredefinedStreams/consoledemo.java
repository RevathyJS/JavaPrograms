/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedStreams;
import java.io.*;

/**
 *
 * @author HP
 */

public class consoledemo {
 
    public static void main(String[] args) throws IOException {
        Console console = System.console();
 
        if(console == null) {
            System.out.println("Console is not supported");
            System.exit(1);
        }
 
        String name = console.readLine("What's your name? ");
        String age = console.readLine("How old are you? ");
        String city = console.readLine("Where do you live? ");
        console.format("%s, a %s year-old man is living in %s", name, age, city);
    }
}
