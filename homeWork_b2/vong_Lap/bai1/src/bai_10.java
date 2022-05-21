
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoatd
 */
public class bai_10 {
    public static void main(String[] args) {
            int n,count=0;
            Scanner sc= new Scanner(System.in);
            System.out.println("Nhap vao so nguyen N de kiem tra");
            n=sc.nextInt();
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2)
                System.out.println(n+"la so nguyen to");
            else
                System.out.println(n+"khong la so nguyen to");
    }
            
}
