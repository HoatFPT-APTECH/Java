
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoatd
 */
public class bai_9 {
    public static void main(String[] args) {
        int a,b,c,uc=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so thu nhat :");
        a=sc.nextInt();
        System.out.println("Nhap so thu hai :");
        b=sc.nextInt();
        System.out.println("Nhap so thu ba");
        c=sc.nextInt();
        Integer [] arr={a,b,c};
       int min=(int) Collections.min(Arrays.asList(arr));
       for(int i=1;i<=min;i++){
           if(a%i==0&&b%i==0&&c%i==0){
               uc=i;
           }
       }
        System.out.println("uoc chung lon nhat la "+uc );
                
        
    }
}
