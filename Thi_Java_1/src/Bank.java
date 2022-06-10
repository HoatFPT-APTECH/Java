/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class Bank {
    double balance,rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }
    public double calculateInterest(){
        double interest;
        interest=balance*(rate/1200);
        return interest;
    }
}
