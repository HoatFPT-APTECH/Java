
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
public class bai_7 {
    
    private static void swap(Integer arr[],int i, int j){
         int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
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
        //start
        System.out.println("mang truoc khi dao lon : "+Arrays.toString(arr));
         
        for(int j=0;j<n/2;j++){
          int temp=arr[j];
          arr[j]=arr[n-j-1];
          arr[n-j-1]=temp;
        }
        System.out.println("mang sau khi dao lon :"+Arrays.toString(arr));
    }
}
