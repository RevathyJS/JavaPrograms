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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    /*
       0 1 2 3
    0  2 3 6 7
    1  3 5 9 
    2  4 8 9 2 8
     */
    public static void main(String[] args) {
        //int a[][] = new int[3][4];
        int a[][] ={{2,3,6,7},{3,5,9},{4,8,9,2,8}}; //jagged array
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
        for(int i[]: a)
        {
            for(int j : i)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }  
}
