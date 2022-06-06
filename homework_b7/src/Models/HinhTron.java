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
public class HinhTron implements Hinh {
    double Bankinh;

    public HinhTron() {
    this.Bankinh=0;
    }

    public HinhTron(double Bankinh) {
        this.Bankinh = Bankinh;
    }

    public double getBankinh() {
        return Bankinh;
    }

    public void setBankinh(double Bankinh) {
        this.Bankinh = Bankinh;
    }
    @Override
       public void Nhap(){
           Scanner sc= new Scanner(System.in);
           System.out.println("Nhập bán kính của đường tròn : ");
           Bankinh=sc.nextDouble();
       };
    @Override
   public void Hienthi(){
       System.out.println("Hình tròn có bán kính là : "+this.Bankinh);
       System.out.println("Diện tích hình tròn là: "+Dientich());
        System.out.println("Chu vi hình tròn là : "+Chuvi());
   };
    @Override
     public double Dientich(){
         return Math.PI*Math.pow(Bankinh, 2);
     };
    @Override
    public double Chuvi(){
        return 2*Math.PI*Bankinh;
    };
}
