/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public abstract class Vehicles implements IVehicle {
     public String maker;
    public String model;
    public double price;

    public Vehicles() {
       maker="...";
       model="...";
       price=0.0;
    }

    public Vehicles(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     @Override
  public abstract void input();
     @Override
  public abstract void display();
}