/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.BanDAO;
import DAO.Connect;
import DAO.NhanVienDAO;
import DTO.BanDTO;
import DTO.NhanVienDTO;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class qlBan extends javax.swing.JFrame {

    private ArrayList<BanDTO> dsb;
    DefaultTableModel model;
    
    public qlBan() {
        initComponents();
        Load();

        this.setLocationRelativeTo(null);
        dsb = new BanDAO().docDSB();
        model = (DefaultTableModel) tbBan.getModel();

        model.setColumnIdentifiers(new Object[]{
            "Mã Bàn", "Loại Bàn", "Trạng Thái"
        });
        DefaultTableModel tableModel = (DefaultTableModel) tbBan.getModel();
           tableModel.setRowCount(0);
        
           
        showTable();// hien thi thong tin trong danh sach
    }

    public void showTable() {

        for (BanDTO b : dsb) {
            model.addRow(new Object[]{
              i++, b.getLOAIBAN(), b.getTRANGTHAI()
            });
        }
    }
    
    public void Load(){
    tbBan.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
                @Override
                public void valueChanged(ListSelectionEvent e){
                    if(tbBan.getSelectedRow() >= 0){
                    txtMaBan.setText(tbBan.getValueAt(tbBan.getSelectedRow(), 0) + "");
                    txtLoaiBan.setText(tbBan.getValueAt(tbBan.getSelectedRow(), 1) + "");
                    txtTrangThai.setText(tbBan.getValueAt(tbBan.getSelectedRow(), 2) + "");
                    }
                }
            });
    
} 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbBan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaBan = new javax.swing.JTextField();
        txtLoaiBan = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Xóa = new javax.swing.JButton();
        Sửa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Bàn", "Loại Bàn", "Trạng Thái"
            }
        ));
        jScrollPane1.setViewportView(tbBan);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Quản lý bàn");

        jLabel2.setText("Mã bàn");

        jLabel3.setText("Loại bàn");

        jLabel4.setText("Trạng thái");

        txtMaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaBanActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Trang Chủ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Xóa.setText("Xóa");
        Xóa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XóaActionPerformed(evt);
            }
        });

        Sửa.setText("Sửa");
        Sửa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SửaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jButton1)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(Xóa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                    .addComponent(Sửa)
                                    .addGap(15, 15, 15))
                                .addComponent(txtLoaiBan)
                                .addComponent(txtTrangThai)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtLoaiBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Xóa)
                            .addComponent(Sửa))))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaBanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new QuanLy().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
                    
                BanDTO b =new BanDTO();
                b.setMABAN(Integer.parseInt(txtMaBan.getText()));
                b.setLOAIBAN(txtLoaiBan.getText());
                b.setTRANGTHAI(txtTrangThai.getText());
       
   
                String qry = "INSERT INTO BAN(MABAN, LOAIBAN, TRANGTHAI) values(" + "'" + txtMaBan.getText() + "'" + "," + "N'" + txtLoaiBan.getText() + "'" + "," + "N'" + txtTrangThai.getText() + "'" + ")";
                System.out.println(qry);
                Connect conn = new Connect();
                System.out.println(qry);
                try{
            
                        try(Statement st = conn.conn.createStatement()){
                                st.executeUpdate(qry);
                            }
                    }
                catch(SQLException e){
                        System.out.println(e.getMessage());
                    }
                
                
                new qlBan().setVisible(true);
                this.dispose();
                        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SửaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SửaActionPerformed
        // TODO add your handling code here:
        
                int i = tbBan.getSelectedRow();
                int selectedID = (int) tbBan.getValueAt(i, 0);
                if(i >= 0){
                                String qry = "UPDATE BAN SET MABAN= " + "'" + txtMaBan.getText() + "'" + ", LOAIBAN=" +"'" + txtLoaiBan.getText() + "'" + ", TRANGHTAI=" + "N'" + txtTrangThai.getText() + "'" + " WHERE MANV=" + selectedID;
                                System.out.println(qry);
                                model.removeRow(i);

                                Connect conn = new Connect();
                            try{

                                try(Statement st = conn.conn.createStatement()){
                                    st.executeUpdate(qry);
                                    }
                                }

                            catch(SQLException e){
                                System.out.println(e.getMessage());
                                                  }
                        }
                new qlBan().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_SửaActionPerformed

    private void XóaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XóaActionPerformed
        // TODO add your handling code here:
                int i = tbBan.getSelectedRow();
                int selectedID = (int) tbBan.getValueAt(i, 0);
                if(i >= 0){
                                String qry = "DELETE FROM BAN WHERE MABAN=" + selectedID;
                                System.out.println(qry);
                                model.removeRow(i);

                                Connect conn = new Connect();
                            try{

                                try(Statement st = conn.conn.createStatement()){
                                    st.executeUpdate(qry);
                                    }
                                }

                            catch(SQLException e){
                                System.out.println(e.getMessage());
                                                  }
                        }
    }//GEN-LAST:event_XóaActionPerformed

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
            java.util.logging.Logger.getLogger(qlBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qlBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qlBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qlBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qlBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sửa;
    private javax.swing.JButton Xóa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbBan;
    private javax.swing.JTextField txtLoaiBan;
    private javax.swing.JTextField txtMaBan;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
    int i = 1;



    public void showResult() {
        BanDTO b = dsb.get(dsb.size() - 1);
        model.addRow(new Object[]{
           i++, b.getLOAIBAN(), b.getTRANGTHAI()
        });
    } 
}