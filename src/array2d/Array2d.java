/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2d;

/**
 *
 * @author Moch Lutfi
 */
public class Array2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] data = new int[0][0];        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(+i+" | "+j);
            }
            System.out.println(" ");
        }        
    }
    
}
