
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoatd
 */
public class bai_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so nguyen duong N de tinh giai thua :");
        int N= sc.nextInt();
        if(N==0||N==1)
            System.out.println("Giai thua cua "+N+" la : 1");
        else if(N<0){
            do{
                System.out.println("Ban nhap sai N<0 moi nhap lai");
                N=sc.nextInt();
            }while(N<0);
            int t=1;
            for(int i=1;i<=N;i++){
                t*=i;
                
            }
            System.out.println("Ket qua giai thua cua "+N+" la :"+t);
        }
        else{
            int t=1;
            for(int i=1;i<=N;i++){
                t*=i;
            }
            System.out.println("Ket qua giai thua cua "+N+" la :"+t);
        }
    }
}
