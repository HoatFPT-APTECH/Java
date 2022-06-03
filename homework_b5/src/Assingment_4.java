
import Models.Zoo;
import Models.Cat;
import Models.dog;
import Models.Animal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class Assingment_4 {
    public static void main(String[] args) {
       Zoo  z = new Zoo();
	Animal a = new Animal("Maica");
	dog d = new dog("Hecules");
	Cat c = new Cat("Tom");
	z.add(a);z.add(d);z.add(c);
	z.sayHello();
/* khái niệm đa hinh
        list.add(new Animal("A");
        list.add(new Dog("B");
        for(int i=0 ;i<list.size();i++){
        list.get(i).sayHello();  // khái niệm đa hình nằm ở hỗ này! 
        }
        */
    }
}
