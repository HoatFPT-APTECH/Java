
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hoatd
 */
public class bai_5 {
    //ham kiem tra so chinh phuong

    public static boolean kt(int a) {
        int i = 1;
        while (i < a) {
            i++;
            if (i * i == a) {
                return true;
            }
        }
        return false;
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap so nguyen thu " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        ///phan rien cua bai 5
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (kt(arr[i])) {
                count++;
            }
        }
        System.out.println("So luon so chinh phuong trong day tren la : " + count);
    }
}
