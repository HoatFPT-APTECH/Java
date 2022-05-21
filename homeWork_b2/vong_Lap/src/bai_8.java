
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoatd
 */
public class bai_8 {
    public static void main(String[] args) {
        int a,b,uc=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so thu nhat :");
        a=sc.nextInt();
        System.out.println("nhap vao so thu hai :");
        b=sc.nextInt();
        if(a<b){
            for(int i=1;i<=a;i++){
                if(a%i==0&&b%i==0){
                    uc=i;
                }
            }
        }
        else{
            for(int i=1;i<=b;i++){
                if(a%i==0&&b%i==0){
                    uc=i;
                }
            }
        }
        System.out.println("uoc chung lon nhat cua "+a+" va " +b+ "la: "+uc);
    }
}
