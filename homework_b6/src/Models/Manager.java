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
public class Manager extends Employee {


        int business_amount = 0;
    public Manager() {

    }

    public double calculatepay() {
        
        if (business_amount > 50000) {
            totalPay = salary + business_amount * 0.1;
        } else if (business_amount < 50000) {
            totalPay = salary + business_amount * 0.05;
        }
        return totalPay;

    }

      public  void Nhap(){
                  Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập Tên của Quản Lý :");
        name = sc.nextLine();
        System.out.println("Nhập lương cơ bản của Quản Lý: ");
        salary = sc.nextDouble();
        System.out.println("Nhập Doanh thu của Quản Lý: ");
        business_amount = sc.nextInt();
      };
    public void display() {

       

         System.out.println("Lương của Quản Lý " + name + " là : " + calculatepay());
    }
;

}
