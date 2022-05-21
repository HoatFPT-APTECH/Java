/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class bai_5 {
    public static void main(String[] args) {
        int kq;
        int [][] arr= new int [9][10];
     for(int i=2;i<11;i++){
         for(int j=1;j<11;j++){
           kq=i*j;
             System.out.print(kq+"\t");
         }
         System.out.println("");
     }
    }
}
