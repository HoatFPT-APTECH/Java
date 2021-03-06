/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Models.clsLophoc;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoatd
 */
public class frmQuanLyLopHoc extends javax.swing.JFrame {
   
    /**
     * Creates new form frmQuanLyLopHoc
     */
    public frmQuanLyLopHoc() {
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
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSLop = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("QUẢN LÝ LỚP HỌC");

        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("XOÁ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        tblDSLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã lớp", "Tên lớp"
            }
        ));
        jScrollPane1.setViewportView(tblDSLop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnThem)
                        .addGap(90, 90, 90)
                        .addComponent(btnSua)
                        .addGap(69, 69, 69)
                        .addComponent(btnXoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void HienthiStart(){
        Vector<clsLophoc> danhsach= new Vector<clsLophoc>();
        int n=CSDL.tbLophoc.hienThiDSLop(danhsach);
        if(n==-1)
            JOptionPane.showMessageDialog(this,"Lỗi kết nối CSDL");
        else if(n==-2)JOptionPane.showMessageDialog(this,"Lỗi cú pháp MYSQL");
        else{
            DefaultTableModel dtm=(DefaultTableModel)this.tblDSLop.getModel();
            dtm.setRowCount(0);
            for(int i=0;i<danhsach.size();i++){
                dtm.addRow(new Object[] {danhsach.get(i).getMalop(),danhsach.get(i).getTenLop()});
            }
        }
    }
    
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int i=this.tblDSLop.getSelectedRow();
        if(i<0)
            JOptionPane.showMessageDialog(this,"Bạn chưa chọn lớp cần sửa. Xinh hãy click chọn và thử lại sau");
        else{
        DefaultTableModel dtm=(DefaultTableModel)this.tblDSLop.getModel();
        int malop=(int )dtm.getValueAt(i,0);
        String tenLop=(String)dtm.getValueAt(i,1);
        frmSuaLopHoc suaLop= new frmSuaLopHoc();
        clsLophoc tLopHoc=new clsLophoc(malop,tenLop);
        suaLop.lopHoc=tLopHoc;
        suaLop.qlLop=this;
        suaLop.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.HienthiStart();


    }//GEN-LAST:event_formWindowOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        frmThemLopHoc themLop= new frmThemLopHoc();
        themLop.qllHoc=this;// truyền lớp này vào cửa sổ fdmThemLopHoc để của sổ frmThemLopHoc có thể tham chiếu đến các hàm của lớp này.
        themLop.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int i=this.tblDSLop.getSelectedRow();
        if(i<0)
            JOptionPane.showMessageDialog(this,"Chưa chọn lớp học");
        else{
            DefaultTableModel dtm=(DefaultTableModel)this.tblDSLop.getModel();
            String tenlop=(String)dtm.getValueAt(i,1);
            int x=JOptionPane.showConfirmDialog(this,"Bạn có muốn xoá lớp: "+tenlop+" hay không? ","Xác thực xoá",JOptionPane.YES_OPTION);
            if(x==JOptionPane.YES_OPTION){
            int malop=(int)this.tblDSLop.getModel().getValueAt(i,0);
            int ketqua=CSDL.tbLophoc.XoaLopHoc(malop);
            if(ketqua==-2)
                JOptionPane.showMessageDialog(this,"Lỗi truy vấn CSDL");
            else if(ketqua==-1)
                    JOptionPane.showMessageDialog(this,"Lỗi kết nối CSDL.");
            else{
                JOptionPane.showMessageDialog(this,"Xoá thành công đối tượng");
                this.HienthiStart();
            }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanLyLopHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDSLop;
    // End of variables declaration//GEN-END:variables
}
