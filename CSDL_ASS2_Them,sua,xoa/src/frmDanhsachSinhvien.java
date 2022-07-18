
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hoatd
 */
public class frmDanhsachSinhvien extends javax.swing.JFrame {

    /**
     * Creates new form frmDanhsachSinhvien
     */
    public frmDanhsachSinhvien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSSinhvien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        tbnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("DANH SÁCH SINH VIÊN");

        tblDSSinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Sinh Viên", "Họ Và tên", "Điện thoại"
            }
        ));
        tblDSSinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSSinhvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSSinhvien);

        jLabel2.setText("Mã SV: ");

        txtMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSVActionPerformed(evt);
            }
        });

        jLabel3.setText("Họ và Tên: ");

        jLabel4.setText("Điện thoại: ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        tbnSua.setText("Sửa");
        tbnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHoTen))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(tbnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtDienThoai))))))
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbnSua)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.HienthiDSSV();
    }//GEN-LAST:event_formWindowOpened

    private void txtMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSVActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String strMaSv = this.txtHoTen.getText();
        String strHoTen = this.txtHoTen.getText();
        String strDienThoai = this.txtDienThoai.getText();
        String sqlThem = "INSERT INTO tbsinhvien(masv,hoten,dienthoai) VALUES (?,?,?);";
        Connection cnn = CSDL.Database.ketnoiMySql();
        if (cnn == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối SQL");
        }
        try {
            PreparedStatement ps = cnn.prepareStatement(sqlThem);
            ps.setString(1, strMaSv);
            ps.setString(2, strHoTen);
            ps.setString(3, strDienThoai);
            //Thực thi lệnh update,insert...
            int i = ps.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Thêm Sinh viên thành công");
                this.HienthiDSSV();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn");
        }


    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbl= (DefaultTableModel) this.tblDSSinhvien.getModel();
        int i=this.tblDSSinhvien.getSelectedRow();
        String msv=(String) this.tblDSSinhvien.getValueAt(i,0);
        int x= JOptionPane.showConfirmDialog(this,"Bạn có muốn xoá thông tin của Sinh Viên có mã Sinh viên: "+msv,"Xác nhận xoá ", JOptionPane.YES_OPTION);
        if(x==JOptionPane.YES_OPTION){
            Connection cnn=CSDL.Database.ketnoiMySql();
            if(cnn==null){
                JOptionPane.showMessageDialog(this, "Lỗi kết nối SQL");
            }else{
                String sql="DELETE  FROM tbsinhvien WHERE masv=?";
                
                try{
                    PreparedStatement pst=cnn.prepareStatement(sql);
                pst.setString(1,msv);
                int u=pst.executeUpdate();
                if(u>0){
                    JOptionPane.showMessageDialog(this,"Xoá Sinh viên thành công");
                    this.HienthiDSSV();
                }
                else
                    JOptionPane.showMessageDialog(this,"Xoá không thành công");
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(this,"Lỗi truy vấn");
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblDSSinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSSinhvienMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tbl= (DefaultTableModel) this.tblDSSinhvien.getModel();
        int i= this.tblDSSinhvien.getSelectedRow();
        String msv=(String)tbl.getValueAt(i, 0);
        String hoten=(String)tbl.getValueAt(i,1);
        String dienthoai=(String)tbl.getValueAt(i, 2);
        this.txtHoTen.setText(hoten);
        this.txtMaSV.setText(msv);
        this.txtDienThoai.setText(dienthoai);
    }//GEN-LAST:event_tblDSSinhvienMouseClicked

    private void tbnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnSuaActionPerformed
        // TODO add your handling code here:
        String msvmoi= this.txtMaSV.getText();
        String hoten=this.txtHoTen.getText();
        String dienthoai=this.txtDienThoai.getText();
        int x=JOptionPane.showConfirmDialog(this,"Bạn có muốn Sửa sinh viên này không","Xác nhận xoá ",JOptionPane.YES_OPTION);
        DefaultTableModel tbl=(DefaultTableModel) this.tblDSSinhvien.getModel();
        int i= this.tblDSSinhvien.getSelectedRow();
        String msv=(String) tbl.getValueAt(i, 0);
        if(x==JOptionPane.YES_OPTION){
            Connection cnn=CSDL.Database.ketnoiMySql();
            if(cnn==null){
                JOptionPane.showMessageDialog(this,"Lỗi kết nối CSDL: SQL");
            }
            else{
                String sql="UPDATE tbsinhvien  SET masv=?,hoten=?,dienthoai=? WHERE masv=?";
                try{
                PreparedStatement pst=cnn.prepareStatement(sql);
                pst.setString(1, msvmoi);
                
                pst.setString(2,hoten);
                pst.setString(3,dienthoai);
                pst.setString(4,msv);
                int u=pst.executeUpdate();
                if(u>0){
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    this.HienthiDSSV();
                }
                }catch(SQLException ex){
                JOptionPane.showMessageDialog(this,"Lỗi truy vấn");
                }
            }
        }
                
    }//GEN-LAST:event_tbnSuaActionPerformed
    public void HienthiDSSV() {
        Connection cnn = CSDL.Database.ketnoiMySql();
        if (cnn == null) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi kết nối CSDL");
        } else {

            
         
            try {
                String sql = "SELECT * FROM tbsinhvien";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                DefaultTableModel tbl = (DefaultTableModel) this.tblDSSinhvien.getModel();
                tbl.setRowCount(0);
                while (rs.next()) {
                    String masv = rs.getString("masv");
                    String hoten = rs.getString("hoten");
                    String dienthoai = rs.getString("dienthoai");
                    tbl.addRow(new Object[]{masv, hoten, dienthoai});
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmDanhsachSinhvien.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,"Lỗi Truy vấn");
            }
           
            
        }
    }

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
            java.util.logging.Logger.getLogger(frmDanhsachSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDanhsachSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDanhsachSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDanhsachSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDanhsachSinhvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDSSinhvien;
    private javax.swing.JButton tbnSua;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    // End of variables declaration//GEN-END:variables
}