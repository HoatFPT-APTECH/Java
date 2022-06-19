/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author hoatd
 */
public abstract class Employee {

  
    String name;
    double salary;
    public double totalPay;
   
    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public abstract double calculatepay();
    public abstract void display();
    public abstract void Nhap();
}
