/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOdemo;

import java.io.*;

public class file {

    public static void main(String arg[]) {

        try {

            int count = 0;

            FileReader fr = new FileReader("aa.txt");

            BufferedReader br = new BufferedReader(fr);

            String word = br.readLine();

            while (word != null) {

                String a[] = word.split(" ");

                for (int i = 0; i < a.length; i++) {

                    if (a[i].length() == 3) {
                        count++;
                    }

                }

                word = br.readLine();

            }

            fr.close();

            System.out.println("Number of three letter word:" + count);

        } catch (IOException e) {

            System.out.println(e);

        }

    }

}
