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
public class Hinhvuong extends Hinhchunhat{

    public Hinhvuong() {
        Dai=Rong=0;
    }

    public Hinhvuong(double canh) {
        super(canh, canh);
    }

    public double getCanh() {
        return Rong;
    }

    public void setCanh(double Canh) {
       this.Rong= this.Dai = Dai;
    }
    @Override
     public void Nhap(){
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhập độ dài cạnh của hình vuông: ");
         Dai=Rong=sc.nextDouble();
     };
    @Override
   public void Hienthi(){
       System.out.println("Hình Vuông có độ dài cạnh là : "+ Dai);
       System.out.println("Diện tích hình vuông : "+Dientich());
       System.out.println("Chu vi hình vuông : "+Chuvi());
   };
    @Override
    public double Dientich(){
        return(Dai*Rong);
    };
    @Override
    public double Chuvi(){
        return super.Chuvi();
    };

    
    
    
    
}
