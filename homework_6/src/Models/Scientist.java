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
public class Scientist extends Employee {

    int publication = 0;

    public Scientist() {
    }

    public double calculatepay() {
      

        if (publication >= 25) {
            totalPay = salary + salary * 0.2;
        } else {
            totalPay = salary + salary * 0.1;
        }
        return totalPay;
    }

      public  void Nhap(){
           Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên của nhà khoa học: ");
        name = sc.nextLine();
        System.out.println("Nhập số bài viết của khoa học trong một tháng: ");
        publication = sc.nextInt();
        System.out.println("Nhập lương cơ bản của nhà Khoa học: ");
        salary = sc.nextInt();
      }
              
    public void display() {

       
        System.out.println("Lương của nhà khoa học " + name + " là: " + calculatepay());
    }
;
}
