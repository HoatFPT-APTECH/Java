/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class test_Assignment_1 {
    public static void main(String[] args) {
        Bank b1= new Bank(1000,10);
        double cal= b1.calculateInterest();
        System.out.println("$"+cal);
    }
}
