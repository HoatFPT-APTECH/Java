/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsSinhvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoatd
 */
public class tbSinhvien {
    public static int TimSinhvien(String tukhoa,Vector<clsSinhvien> danhsach){
        Connection cnn=CSDL.Database.ketnoiMySql();
        if(cnn==null){
            return -1;
        }
        // truy van du lieu tu bang tbSinhvien va them vao danh sach
        String sql="SELECT * FROM tbsinhvien";
        if(tukhoa.equals("")==false){// nếu từ khoá khác "" thì thêm mệnh đề where
            sql+=" WHERE hoten LIKE '%"+tukhoa+"%'";
        }
        try {
            PreparedStatement stm= cnn.prepareStatement(sql);
            ResultSet rs=stm.executeQuery();
            while(rs.next()){
                String masv=rs.getString("masv");
                String hoten=rs.getString("hoten");
                String dienthoai= rs.getString("dienthoai");
                clsSinhvien sv= new clsSinhvien(masv,hoten, dienthoai);
                danhsach.add(sv);
            }
            return danhsach.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbSinhvien.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
        
    }
}
