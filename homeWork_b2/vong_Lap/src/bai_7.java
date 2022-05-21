
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoatd
 */
public class bai_7 {
    public static void main(String[] args) {
        int max;
        Scanner sc=new Scanner(System.in);
        int [] arr= new int [100];
        System.out.println("Nhap vao day cac so nguyen ( nhap so 0 ) de ket thuc: ");
        max=arr[0]=sc.nextInt();
        for(int i=1;i<100;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0)break;
            else
            if(arr[i]>=max)max=arr[i];
            
        }
        System.out.println("so lon nhat trong cac so vua nhap la: "+max);
    }
}
