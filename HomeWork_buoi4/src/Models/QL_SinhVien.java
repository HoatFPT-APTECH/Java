/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;
/**
 *
 * @author hoatd
 */
public class QL_SinhVien {
    ArrayList<SinhVien> DS_sv;
    public QL_SinhVien(){
        DS_sv= new ArrayList();
        
    }
    public void Nhap(){
        int i=0;
        SinhVien sv= new SinhVien();
        String input;
        Scanner sc= new Scanner(System.in);
        do{
            sv.Nhap();
          
            if(sv==null){
                System.out.println("Tạo đối tượng sinh viên mới bị lỗi => Tạo lại");
            }
              DS_sv.add(sv);
              System.out.println("Bạn có muốn tạo tiếp Sinh viên mới không (c (có)/k(Không)):");
            input=sc.next();
            System.out.println(input);
        }while(input.equalsIgnoreCase("c"));
    }
    public void hienThi(){
        Iterator it=DS_sv.iterator();
        System.out.println("Danh sách Sinh viên đã lưu :");
       for(int i=0;i<DS_sv.size();i++){
           System.out.println("MSV: "+DS_sv.get(i).MSV+"\t Họ và tên : "+DS_sv.get(i).hoTen+" \t Điểm : "+DS_sv.get(i).score);
       }
    }
    public void sapXep(){
        for(int i=0;i<DS_sv.size()-1;i++){
            for(int j=0;j<DS_sv.size()-i-1;i++){
                SinhVien temp=new SinhVien();
             
        }
    }
    }
}
