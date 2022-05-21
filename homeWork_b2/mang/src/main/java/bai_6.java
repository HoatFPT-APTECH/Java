
import java.util.Scanner;
import java.util.Arrays;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("mang co chieu dai n (n<=100) la: ");
        int n = sc.nextInt();
        if (n > 100 || n <= 0) {
            while (n > 100 || n <= 0) {
                System.out.println("nhap n sai moi nhap lai");
                n = sc.nextInt();
            }
        }
        Integer [] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap so nguyen thu " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
         System.out.println("Mang truoc khi sap sep:\n"+Arrays.toString(arr));
         Arrays.sort(arr);
         System.out.println("Mang sau khi sap xep : "+Arrays.toString(arr));
    }
}
