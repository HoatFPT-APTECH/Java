/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author hoatd
 */
public class bai_2 {
    public static void main(String[] args) {
        System.out.println("Phuong trinh bac hai : a.x^2+b.x+c=0");
        float a,b,c;
        Scanner sc= new Scanner(System.in);
         System.out.println("nhap vao a:");
        a=sc.nextInt();
        System.out.println("Nhap vao b:");
        b=sc.nextInt();
          System.out.println("Nhap vao c:");
        c=sc.nextInt();
        if(a==0&&b==0&&c==0){
            System.out.println("Phuong trinh co vo so nghiem");
        }
        else if(a==0&&b==0&&c!=0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(a==0&&b!=0&&c!=0){
            System.out.println("Phuong trinh co nghiem duy nhat: x = "+(-c/b));
        }
        else{
            double delta=Math.pow(b, 2) -4*a*c;
            if(delta>0){
                System.out.println("Phuong trinh co 2 nghiem: ");
                double x1=(-b-Math.sqrt(delta))/(2*a);
                  double x2=(-b+Math.sqrt(delta))/(2*a);
                  System.out.println("x1 = "+x1+" ; x2 = "+x2);
            }
            else if(delta==0){
                double x=(-b/(2*a));
                System.out.println("Phuong trinh co nghiem kep : x1=x2= "+x);
            }
            else System.out.println("Phuong trinh vo nghiem");
        }
    }
}
