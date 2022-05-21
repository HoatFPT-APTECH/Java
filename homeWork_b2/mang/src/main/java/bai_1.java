
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoatd
 */
public class bai_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("mang co chieu dai n (n<=100) la: ");
        int n=sc.nextInt();
        if(n>100||n<=0){
            while(n>100||n<=0){
                System.out.println("nhap n sai moi nhap lai");
                n=sc.nextInt();
            }
        }
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("nhap so nguyen thu "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        long total=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0) total+=arr[i];
        }
        System.out.println("tong cac so le trong day tren la "+total);
    }
}
