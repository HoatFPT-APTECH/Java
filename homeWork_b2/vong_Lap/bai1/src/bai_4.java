
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class bai_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so can in bang nhan voi cac so tu 1 -> 10: ");
        int a=sc.nextInt();
        int kq;
        System.out.println("ket qua nhan "+a+" voi cac so tu 1->10");
        for(int i=1;i<11;i++){
       
           kq=a*i;
            System.out.print(a+"*"+i+"="+kq);
            System.out.println("");
        }
    }
}
