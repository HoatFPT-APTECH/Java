/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

/**
 *
 * @author hoatd
 */
public class B_grade extends Generate {
    String monThi="Toán, Hoá,Sinh";
        @Override
    public void display(){
        super.display();
        System.out.println(" Khối thi B \t Các môn thi: "+monThi
        );
    }

    public B_grade() {
    }
}
