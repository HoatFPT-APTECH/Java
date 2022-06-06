/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
import Models.Hinh;
import Models.HinhTron;
import Models.Hinhchunhat;
import Models.Hinhvuong;
import java.util.Scanner;
public  class Assingment_1 {
    public static void work(Hinh h){
        h.Nhap();
        h.Hienthi();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int chon;
        Hinhchunhat hcn= new Hinhchunhat();
        Hinhvuong hv= new Hinhvuong();
        HinhTron ht= new HinhTron();
        do{
        System.out.println("+ Phương thức main() tổ chức dạng menu\n" +
"1. Hình chữ nhật\n" +
"2. Hình vuông\n" +
"3. Hình tròn\n" +
"4. Thoát\n" +
"Mời bạn chọn:");
        chon=sc.nextInt();
        switch(chon){
            case 1:
                work(hcn);break;
            case 2:
                work(hv); break;
            case 3:
                work(ht);break;
            case 4: System.out.println("Hẹn gặp lại ");
        }
        }while(chon!=4);
                
    }
}
