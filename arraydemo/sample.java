/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

/**
 *
 * @author HP
 */
public class sample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]=new int[3]; // declare + memory(instantiate)
        a[0]=1; // initialization
        a[1]=3;
        a[2]=4;
        
        /*for(int i=0;i<3;i++)
        {
            a[i]=i+1; // initialization
            System.out.println(a[i]);
        }*/
        for(int i:a)
        {
            System.out.println(i);
        }
        int a1[]={1,2,3}; //declare + memory + initial
        
        int a2[]=new int[]{1,2,3}; //declare + memory + initial
        
        int []a3;
        int[] a4;
        
        
        int [][]b4=new int[2][3];
        int[][] b2;
        int []b3[];
        
        b4[0][0]=2;
        
        
       //jagged array
        // 1 2 3 4
        // 5 6
        // 7 8 9
        // 1 2 3 4 5
        int b1[][]=new int[][]{{1,2,3,4},{5,6},{7,8,9},{1,2,3,4,5}};
        for(int i=0;i<b1.length;i++) //no of rows
        {
            for(int j=0;j<b1[i].length;j++) // row length
            {
                System.out.print(b1[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(int i[]:b1)
        {
            for(int j: i)
            {
                 System.out.print(j+"\t");
            }
          System.out.println();
        }
        
}
}