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
public class clsLophoc {
    int Malop;
    String tenLop;

    public clsLophoc() {
    }

    public clsLophoc(int Malop, String tenLop) {
        this.Malop = Malop;
        this.tenLop = tenLop;
    }

    public int getMalop() {
        return Malop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setMalop(int Malop) {
        this.Malop = Malop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    
}
