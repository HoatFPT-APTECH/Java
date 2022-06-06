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
public class Laborer extends Employee {

    int hrsworked;

    public Laborer() {
    }

    public double calculatepay() {
      

        if (hrsworked >= 50) {
            totalPay = salary + salary * 0.15;
        } else {
            totalPay = salary + salary * 0.08;
        }
        return totalPay;

    }

      public void Nhap(){
              Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của Nhân viên phòng thí nghiệm: ");
        name = sc.nextLine();
        System.out.println("Nhập lương cơ bản của Nhân viên phòn thí nghiệm: ");
        salary = sc.nextDouble();
        System.out.println("nhập vào số giờ làm việc của Nhân viên phòng thí nghiệm : ");
        hrsworked = sc.nextInt(); 
      };
      
    public void display() {

        System.out.println("Lương của nhân viên thí nghiệm " + name + " là" + calculatepay());
    }
;
}
