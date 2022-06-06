/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.truck;

import java.util.Scanner;
import vehicle.Vehicles;

/**
 *
 * @author hoatd
 */
public class Truck extends Vehicles {

    public int truckload;

    public Truck() {
        super();

        truckload = 0;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào Model của ô tô tải : ");
        model = sc.nextLine();
        System.out.println("Nhập vào trọng tải của ô tô tải: ");
        truckload = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào tên người chế tạo: ");
        maker = sc.nextLine();

        System.out.println("Nhập vào Giá của ô tô tải: ");
        price = sc.nextDouble();

    }

    @Override
    public void display() {
        System.out.println("Model: " + model
                + "\n Trọng tải: " + truckload
                + "\n Giá: " + price
                + "\n Người chế tạo: " + maker);
    }

}
