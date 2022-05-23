
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
        int a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Phuong trinh : a.x+b=0");
        System.out.println("nhap vao a:");
        a=sc.nextInt();
        System.out.println("Nhap vao b:");
        b=sc.nextInt();
        if(a==0&&b!=0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(a==0&&b==0){
            System.out.println("Phuong trinh co vo so nghiem");
        }else if(a!=0&&b==0){
            System.out.println("Phuong trinh co vo so nghiem");
        }else {
            System.out.println("Phuong trinh co nghiem duy nhat : x = "+ ((float)-b/a));
        }
    }
}
