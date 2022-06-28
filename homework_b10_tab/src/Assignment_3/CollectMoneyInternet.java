/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

/**
 *
 * @author hoatd
 */
public class CollectMoneyInternet extends CollectMoney{
    int soThang;
    final int donGia= 285000;

    public CollectMoneyInternet() {
    }

    public CollectMoneyInternet(int soThang) {
        this.soThang = soThang;
    }

    public int getSoThang() {
        return soThang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setSoThang(int soThang) {
        this.soThang = soThang;
    }
    public double calculateMoney(){
        double thanhTien=0;
        if(soThang<3){
            thanhTien=soThang*donGia;
            
        }
        else if(soThang>=3&&soThang<=6){
            thanhTien=soThang*donGia*0.95;
        }
        else thanhTien=soThang*donGia*0.9;
        return thanhTien;
    }
}
