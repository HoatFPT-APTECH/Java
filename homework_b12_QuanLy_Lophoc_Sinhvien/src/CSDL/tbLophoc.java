/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsLophoc;
import Models.clsSinhvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 */
public class tbLophoc {
    public Vector<clsLophoc> LayDSSV(Vector<clsLophoc> list){
        Connection cnn= CSDL.Database.KetnoiCSDL();
        
        if(cnn!= null){
        String sql="SELECT * FROM tbLophoc";
            try {
                PreparedStatement ps= cnn.prepareStatement(sql);
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    int malop=rs.getInt("malop");
                    String tenlop=rs.getString("tenlop");
                    clsLophoc lophoc= new clsLophoc(malop,tenlop);
                    list.add(lophoc);
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
        
        return list;
    }
    
    public static int hienThiDSLop(Vector<clsLophoc> danhsach){
        Connection cnn=CSDL.Database.KetnoiCSDL();
        if(cnn==null)return -1;
        else{
            String sql="SELECT * FROM tblophoc";
            try {
                PreparedStatement pst=cnn.prepareStatement(sql);
                ResultSet rs=pst.executeQuery();
                int dem=0;
                while(rs.next()){
                    int malop=rs.getInt("malop");
                    String tenlop=rs.getString("tenlop");
                    clsLophoc lophoc=new clsLophoc(malop,tenlop);
                    danhsach.add(lophoc);
                    dem++;
                            
                }
                return dem;
            } catch (SQLException ex) {
                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }
    public static int themLopHoc(String tenLop){
        Connection cnn=CSDL.Database.KetnoiCSDL();
        if(cnn==null)return -1;
        else{
            String sql="INSERT INTO tblophoc(tenlop) VALUES (?)";
            try {
                PreparedStatement pst=cnn.prepareStatement(sql);
                pst.setString(1,tenLop);
                int e=pst.executeUpdate();
                return e;
            } catch (SQLException ex) {
                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }
    public static int XoaLopHoc(int malop){
         Connection cnn=CSDL.Database.KetnoiCSDL();
        if(cnn==null)return -1;
        else{
            String sql="DELETE FROM tblophoc WHERE malop=?";
             try {
                 PreparedStatement pst=cnn.prepareStatement(sql);
                 pst.setInt(1, malop);
                 int n=pst.executeUpdate();
                 return n;
             } catch (SQLException ex) {
                 Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
                 return -2;
             }
            
        }
    }
    public  static int SuaLopHoc(int malop,String tenLop){
         Connection cnn=CSDL.Database.KetnoiCSDL();
        if(cnn==null)return -1;
        else{
            String sql="UPDATE tblophoc SET tenlop=? WHERE malop=?";
             try {
                 PreparedStatement pst=cnn.prepareStatement(sql);
                 pst.setString(1,tenLop);
                 pst.setInt(2, malop);
                 int n=pst.executeUpdate();
                 return n;
                 
             } catch (SQLException ex) {
                 Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
                 return -2;
             }
        }
    }
    public static int LayDSLop(Vector danhsach){
                Connection cnn=CSDL.Database.KetnoiCSDL();
        if(cnn==null)return -1;
        else{
            String sql="SELECT * FROM tblophoc";
            try {
                PreparedStatement pst=cnn.prepareStatement(sql);
                ResultSet rs=pst.executeQuery();
                int dem=0;
                while(rs.next()){
                     String tenlop=rs.getString("tenlop");
                    danhsach.add(tenlop);
                    dem++;
                            
                }
                return dem;
            } catch (SQLException ex) {
                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }
    
}
