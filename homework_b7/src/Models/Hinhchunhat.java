package Models;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class Hinhchunhat implements Hinh {
    double Dai, Rong;

    public double getDai() {
        return Dai;
    }

    public double getRong() {
        return Rong;
    }

    public void setDai(double Dai) {
        this.Dai = Dai;
    }

    public void setRong(double Rong) {
        this.Rong = Rong;
    }

    public Hinhchunhat() {
        this.Dai=0;
        this.Rong=0;
    }

    public Hinhchunhat(double Dai, double Rong) {
        this.Dai = Dai;
        this.Rong = Rong;
    }
    @Override
     public void Nhap(){
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhập chiều dài của hình chữ nhật : ");
         Dai=sc.nextDouble();
         System.out.println("Nhập chiều rộng của hình chữ nhật: ");
         Rong= sc.nextDouble();
         
     };
    @Override
   public void Hienthi(){
       System.out.println("Hình chữ nhật có : Chiều dài "+Dai+"\n Chiều rộng: "+Rong);
       System.out.println("Diện tích hình chữ nhật : "+Dientich());
       System.out.println("Chu vi hình chữ nhật là : "+Chuvi());
   };
    @Override
    public double Dientich(){
        return(Dai*Rong);
    };
    @Override
    public double Chuvi(){
        return((Dai+Rong)*2);
    };
}
