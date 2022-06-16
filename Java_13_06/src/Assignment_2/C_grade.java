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
public class C_grade extends Generate {
    String monThi="Văn, Sử , Địa";

    public C_grade() {
    }
    
        @Override
    public void display(){
        super.display();
        System.out.println(" Khối thi A \t Các môn thi: "+monThi);
    }
}
