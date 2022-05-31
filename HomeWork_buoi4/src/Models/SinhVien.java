/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public class SinhVien {
    String MSV,hoTen;
    double score;

    public SinhVien(String MSV, String hoTen, double score) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.score = score;
    }

    public SinhVien() {
    }
    
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Nhập Mã Sinh Viên:");
        MSV=sc.nextLine();
        System.out.println("Nhập Họ và Tên : ");
        hoTen=sc.nextLine();
        System.out.println("Nhập điểm : ");
        score=sc.nextInt();
        
    }
    public void HienThi(){
        System.out.println("MSV : "+ MSV+"\t Họ Và tên : "+hoTen+"\t Điểm: "+score);
    }
}
