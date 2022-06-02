/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author hoatd
 */
public class Cat extends Animal {
    public Cat(String c){
      super(c);
      
    }
     public void sayHello(){
        System.out.println("Meow,Meow, my name is …"+name);
    }
}
