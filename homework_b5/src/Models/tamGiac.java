package Models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
 import java.lang.Math;
public class tamGiac {
    double a,b,c;
     public tamGiac (){
    }

    public tamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double chuVi(){
        return a+b+c;
    }
    public double dienTich(){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
    } 
    public void hienThi(){
        System.out.println("Chu vi: "+chuVi()+"\n Diện tích : "+dienTich());
    }
}

