/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public class Animal {
String name;
    public Animal(String name) {
        this.name = name;
    }
    public Animal(){
        
    }
    public void add(){
        Scanner sc= new Scanner(System.in);
        System.out.println("What's your name Animal ?");
        name=sc.nextLine();
      
    }
    public void sayHello(){
        System.out.println("Hi, I am animal, my name is …"+name);
    }
    
}
