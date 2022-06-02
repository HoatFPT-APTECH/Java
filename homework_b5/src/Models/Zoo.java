/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public class Zoo extends Animal {

    ArrayList<Animal> list;
    int n;

    public Zoo() {
        super();
        this.list = new ArrayList();

    }

    public String addZoo() {
        Animal zoo = new Animal();
        zoo.add();
        int flag = 0;
        for (Animal element : list) {
            if (zoo.name.equalsIgnoreCase(element.name)) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Đã có con thú này trong sở thú .");
        } else if(!(zoo.name == null || zoo.name.trim().length() == 0)) {
            list.add(zoo);
        }
      return zoo.name;
    }
    public void remove(String input){
      
        int flag=0;
        for(Animal element:list){
            if(input.equalsIgnoreCase(element.name)){
                 list.remove(element);
                 System.out.println("Đã xoá thành công");
                 flag=1;
                 break;
            }
        }
       if(flag==0)System.out.println("Không tìm thấy đối tượng trong danh sách");
    }
    @Override
    public void sayHello(){
         System.out.println("Hi, I am animal, We are …");
         list.forEach((element) -> {
             System.out.println(element.name);
        });
    }
    public void add(Animal c){
        list.add(c);
    }
    
}
