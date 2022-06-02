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
public class tamGiacCan extends tamGiac{
   public tamGiacCan(double i){
       this.a=this.b=this.c=i;
   }
   @Override
   public double chuVi(){
        return 3*a;
    }
   @Override
    public double dienTich(){
       return a*a*Math.sqrt(3) / 4;
    } 
    
}