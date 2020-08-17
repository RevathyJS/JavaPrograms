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
public class jagged {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[];
        int[] a1;
        int []a2;
        int b[][];
        int[][] b1;
        //int [][]b2;
        int []b3[];
        a=new int[3];
        a1=new int[5];
        a2=new int[]{2,3};
        b=new int[3][2];
        b1=new int[][]{{1,2},{4,5},{6,7}};
        int b2[][]={{1,2,3,4},{5,6},{3,4,5},{1,2,3,4,5}};
        int i,j;
        for(i=0;i<b2.length;i++)
        {
            for(j=0;j<b2[i].length;j++)
            {
                System.out.print(b2[i][j]+"\t");
            }
            System.out.println();
        }
        //int k[];
        for(int k[] : b2)
        {
            for(int k1:k)
            {
                System.out.print(k1+"\t");
            }
            System.out.println();
        }
    }
    
}
