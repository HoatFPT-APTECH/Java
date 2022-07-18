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
public class CollectMoneyElectric extends CollectMoney {
    int chiSoDau;
    int chiSoCuoi;
    final int donGia=2500;
    public CollectMoneyElectric() {
    }

    public CollectMoneyElectric(int chiSoDau, int chiSoCuoi) {
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
    }

    public int getChiSoDau() {
        return chiSoDau;
    }

    public int getChiSoCuoi() {
        return chiSoCuoi;
    }

    public void setChiSoDau(int chiSoDau) {
        this.chiSoDau = chiSoDau;
    }

    public void setChiSoCuoi(int chiSoCuoi) {
        this.chiSoCuoi = chiSoCuoi;
    }
    public double calculateMoney(){
        int soTieuThu=this.chiSoCuoi-this.chiSoDau;
        double thanhTien=0;
        if(soTieuThu<100){
            thanhTien=soTieuThu*donGia;
        }
        else if(soTieuThu>100&&soTieuThu<300){
            thanhTien=(double)soTieuThu*donGia*1.05;
        }
        else thanhTien=(double)soTieuThu*donGia*1.1;
        return thanhTien;
    }
}
