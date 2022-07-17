/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Models.clsSinhvien;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoatd
 */
public class frmThemSinhvien extends javax.swing.JFrame {

    /**
     * Creates new form frmThemSinhvien
     */
    frmQuanLySinhVien qlsv;
    File imageFile;
    public frmThemSinhvien() {
        initComponents();
    }
    public void hienthi(){
        Vector<String> danhsach=new Vector<String>();
        int ketqua=CSDL.tbLophoc.LayDSLop(danhsach);
         if(ketqua==-2)
             JOptionPane.showMessageDialog(this,"Lỗi truy vấn SQL");
         else if(ketqua==-1)
             JOptionPane.showMessageDialog(this,"Lỗi kết nối CSDL.");
         else {
             DefaultComboBoxModel dcm= new DefaultComboBoxModel(danhsach);
             this.cbbLopHoc.setModel(dcm);
             this.cbbLopHoc.insertItemAt("Chọn lớp học", 0);
             this.cbbLopHoc.setSelectedIndex(0);
             
         }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btgGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSinhVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbbLopHoc = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        btnChonAnh = new javax.swing.JButton();
        txtChonAnh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblHienThiAnh = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("THÊM SINH VIÊN");

        jLabel2.setText("Mã Sinh viên:");

        jLabel3.setText("Họ Tên:");

        jLabel4.setText("Giới tính:");

        rdNam.setText("Nam");

        rdNu.setText("Nữ");
        rdNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNuActionPerformed(evt);
            }
        });

        jLabel5.setText("Địa chỉ: ");

        jLabel6.setText("Lớp học:");

        cbbLopHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnChonAnh.setText("Chọn");
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });

        txtChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChonAnhActionPerformed(evt);
            }
        });

        jLabel8.setText("HÌnh ảnh: ");

        lblHienThiAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHienThiAnh.setAlignmentY(0.0F);
        lblHienThiAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaSinhVien)
                            .addComponent(txtHoTen)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdNam)
                                .addGap(64, 64, 64)
                                .addComponent(rdNu))
                            .addComponent(txtDiachi)
                            .addComponent(cbbLopHoc, 0, 254, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnThem)
                        .addGap(118, 118, 118)
                        .addComponent(btnDong))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHienThiAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rdNam)
                            .addComponent(rdNu))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbbLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnDong)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnChonAnh)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(txtChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblHienThiAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNuActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        this.dispose();
        qlsv.HienthiDSSinhvien();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
      
     String masv=this.txtMaSinhVien.getText();
     String hoten=this.txtHoTen.getText();
    
     boolean gioitinh=(this.rdNam.isSelected())?true:false;
     String diachi=this.txtDiachi.getText();
   
     String tenlop="";
     if(this.cbbLopHoc.getSelectedIndex()>0)
     tenlop=(String)this.cbbLopHoc.getSelectedItem();
     else
         JOptionPane.showMessageDialog(this,"Bạn chưa chọn mã lớp.");
     String hinhanh=this.txtChonAnh.getText();
     if (imageFile != null) {
                //String img = ImageFile.getName();
                String filecopy = "src/Images/" + hinhanh;
                File fc = new File(filecopy);// tạo đối tượng file.
                try {
                    Files.copy(imageFile.toPath(), fc.toPath(),StandardCopyOption.REPLACE_EXISTING);
                    
                } catch (IOException ex) {
                    Logger.getLogger(frmThemSinhvien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        Connection cnn=CSDL.Database.KetnoiCSDL();
     if(cnn==null)
         JOptionPane.showMessageDialog(this,"Lỗi kết nối CSDL.");
     else{
     String sql="SELECT tblophoc.malop FROM tblophoc WHERE tenlop=?;";
        try {
            PreparedStatement pst=cnn.prepareStatement(sql);
            pst.setString(1,tenlop);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
               int malop=rs.getInt("malop");
               clsSinhvien sv=new clsSinhvien(0,masv,hoten,gioitinh,diachi,malop,tenlop,hinhanh);
               int ketqua=CSDL.tbSinhvien.ThemSinhvien(sv);
               if(ketqua==-2)
                   JOptionPane.showMessageDialog(this,"Lỗi truy vấn.");
               else if(ketqua==-1)
                   JOptionPane.showMessageDialog(this,"Lỗi kết nối");
               else{
                   JOptionPane.showMessageDialog(this,"Thêm Sinh viên thành công");
                   
                   qlsv.HienthiDSSinhvien();
               }
            }
              
        } catch (SQLException ex) {
            Logger.getLogger(frmThemSinhvien.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Lỗi truy vấn.");
        }
     }
   
    }//GEN-LAST:event_btnThemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.hienthi();
    }//GEN-LAST:event_formWindowOpened

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        // TODO add your handling code here:
        JFileChooser file= new JFileChooser();// tao doi tuong chon file
        FileNameExtensionFilter fnef=new FileNameExtensionFilter("Hình ảnh : JGP,JPN,...",  new String[] {"jpg","jped","gif","png"});// loc file
        file.addChoosableFileFilter(fnef);// doi tuong loc file them su lua chon loc file.
        int choose= file.showOpenDialog(this);
        if(choose==JFileChooser.APPROVE_OPTION){
            imageFile= file.getSelectedFile();
            clsTienich.Hienthianh_Label(imageFile,lblHienThiAnh);
            this.txtChonAnh.setText(imageFile.getName());
            
        }
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void txtChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChonAnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChonAnhActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmThemSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmThemSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmThemSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmThemSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmThemSinhvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGender;
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbbLopHoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblHienThiAnh;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTextField txtChonAnh;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSinhVien;
    // End of variables declaration//GEN-END:variables
}
