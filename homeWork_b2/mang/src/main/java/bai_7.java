
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
    private  void swap(int arr[],int i,int j){
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
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap so nguyen thu " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        // phan rieng cua bai 7
        bai_7 sw= new bai_7();
        if(n%2==0){
            for(int i=0;i<n/2;i++){
               
                sw.swap(arr,i,(n-i)  );
            }
            System.out.println("Mang sau khi sap xep:"+Arrays.toString(arr));
        }
    }
}
