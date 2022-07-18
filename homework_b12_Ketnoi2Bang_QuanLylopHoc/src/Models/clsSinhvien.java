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
public class clsSinhvien {
    int id,malop;
    String  masv,hoten,diachi;
    boolean gioitinh;

    public clsSinhvien() {
    }

    public clsSinhvien(int id, int malop, String masv, String hoten, String diachi, boolean gioitinh) {
        this.id = id;
        this.malop = malop;
        this.masv = masv;
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public int getId() {
        return id;
    }

    public int getMalop() {
        return malop;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
    
}
