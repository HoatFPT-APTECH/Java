/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author hoatd
 */
public class Dictionary {
    String eng;
    String viet;
    HashMap <String,String> td;
    public Dictionary(){
         td= new HashMap();
    }
    public void themTu(String eng, String viet){
     
      if(td.containsKey(eng) ){
          System.out.println("Lỗi đã có từ tiếng anh");
      }
      else if(eng.trim().length()==0){
          System.out.println(" Thêm từ bị lỗi do từ thêm không do từ thêm không được định nghĩa");
      }
      else{
           this.eng=eng;
      this.viet=viet;
      td.put(eng,viet);
          System.out.println("Thêm từ thành công");
      }
    }
    public void hienThi(){
      for(String i: td.keySet()){
          System.out.println(i+" : "+td.get(i));
    }
}
    public void suaTu(String eng,String viet){
        if(td.containsKey(eng)){
            td.put(eng, viet);
            System.out.println("Sửa từ thành công");
        } else
        System.out.println("Sửa từ thất bại");
    }
    public void xoaTu(String eng){
        if(td.containsKey(eng)){
            td.remove(eng);
            System.out.println("Xoá từ thành công");
        }else
        System.out.println("Xoá từ thất bại");
    }
    public void traTu(String Eng){
        if(td.containsKey(Eng)){
            System.out.println("Đã tìm thấy từ cần tra");
            System.out.println(Eng+" : "+td.get(Eng));
        }
        else
            System.out.println("Không tìm thấy từ cần tra");
    }
    
}
