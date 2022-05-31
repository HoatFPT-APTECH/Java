
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoatd
 */
public class bai_3 {
    public static void main(String[] args) {
        int m,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao nam : ");
        y=sc.nextInt();
        System.out.println("Nhap vao thang:");
        m=sc.nextInt();
        if(y%4==0){
            System.out.println("Nam la nam nhuan");
            switch(m){
                case 4,6,9,11 : System.out.println(" Thang co 30 ngay");break;
                case 1,3,5,7,8,10,12 : System.out.println("Thang co 31 ngay");break;
                case 2: System.out.println("Thang co 29 ngay");break;
                default:
                   System.out.println("ban nhap sai thang : thang tu 1->12"); break;
            }
        }
        else{
            switch(m){
                case 4,6,9,11: System.out.println(" Thang co 30 ngay");break;
                case 1,3,5,7,8,10,12: System.out.println("Thang co 31 ngay");break;
                case 2: System.out.println("Thang co 28 ngay");break;
                default:
                   System.out.println("ban nhap sai thang : thang tu 1->12"); break;
            }
        }
    }
}
