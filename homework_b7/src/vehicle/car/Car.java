/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.car;

import java.util.Scanner;
import vehicle.Vehicles;

/**
 *
 * @author hoatd
 */
public class Car extends Vehicles {

    public String color;

    public Car() {
        super();
        color = "";
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào Model của ô tô: ");
        model = sc.nextLine();
        System.out.println("Nhập vào tên người chế tạo: ");
        maker = sc.nextLine();
        System.out.println("Nhập vào màu sắc của ô tô: ");
        color = sc.nextLine();
        System.out.println("Nhập vào Giá của ô tô: ");
        price = sc.nextDouble();
        sc.nextLine();

    }

    @Override
    public void display() {
        System.out.println("Model: " + model
                + "\n Màu: " + color
                + "\n Giá: " + price
                + "\n Người chế tạo: " + super.maker);
    }

}
