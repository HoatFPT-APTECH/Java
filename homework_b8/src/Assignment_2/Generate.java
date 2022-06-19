/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public abstract class Generate {
    public String sbd,name,address;
    public int mucUT;

    public Generate() {
    }
    public void add(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào số báo danh của thí sinh: ");
        sbd=sc.nextLine();
        System.out.println("Nhập vào tên của thí sinh: ");
        name= sc.nextLine();
        System.out.println("Nhập vào địa chỉ của thí sinh: ");
        address= sc.nextLine();
        System.out.println("Nhập vào mức ưu tiên của thí sinh: ");
        mucUT=sc.nextInt();
    }
    public void display(){
        System.out.println("Thông tin của thí sinh: ");
        System.out.println("SBD: "+sbd+" Tên: "+name+" Địa chỉ: "+address+" Mức ưu tiên: "+mucUT);
    }
}
