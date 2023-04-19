/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import BUS.ThucDonBUS;
import DAO.Connect;
import DAO.NhanVienDAO;
import DAO.ThucDonDAO;
import DTO.NhanVienDTO;
import DTO.ThucDonDTO;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class qlThucDon extends javax.swing.JFrame {
    private ArrayList<ThucDonDTO> dstd;
    private DefaultTableModel model;
    /**
     * Creates new form qlThucDon
     */
    public qlThucDon() {
        initComponents();
        Load();
        this.setLocationRelativeTo(null);
        dstd = new ThucDonDAO().docDSTD();
        model = (DefaultTableModel) tbTD.getModel();

        model.setColumnIdentifiers(new Object[]{
           "Mã Món Ăn", "Tên Món ĂN", "Đơn Giá", "Loại"
        });
        DefaultTableModel tableModel = (DefaultTableModel) tbTD.getModel();
           tableModel.setRowCount(0);
        
           
        showTable();// hien thi thong tin trong danh sach
    }

    public void showTable() {
        for (ThucDonDTO td : dstd) {
            model.addRow(new Object[]{
               i++, td.getTENMONAN(), td.getDONGIA(), td.getLOAITO()
            });
        }
    }
    
    
    public void Load(){
    tbTD.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
                @Override
                public void valueChanged(ListSelectionEvent e){
                    if(tbTD.getSelectedRow() >= 0){
                    txtMAMONAN.setText(tbTD.getValueAt(tbTD.getSelectedRow(), 0) + "");
                    txtTENMONAN.setText(tbTD.getValueAt(tbTD.getSelectedRow(), 1) + "");
                    txtDONGIA.setText(tbTD.getValueAt(tbTD.getSelectedRow(), 2) + "");
                    txtLOAITO.setText(tbTD.getValueAt(tbTD.getSelectedRow(), 3) + "");
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
        tbTD = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMAMONAN = new javax.swing.JTextField();
        txtTENMONAN = new javax.swing.JTextField();
        txtDONGIA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLOAITO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbTD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Món", "Tên Món Ăn", "Đơn Giá", "Loại Tô"
            }
        ));
        jScrollPane1.setViewportView(tbTD);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý thực đơn");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mã Món");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên Món Ăn");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Đơn Giá");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Trang chủ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/logo/Screenshot 2021-03-18 142447.png"))); // NOI18N

        txtMAMONAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMAMONANActionPerformed(evt);
            }
        });

        txtTENMONAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTENMONANActionPerformed(evt);
            }
        });

        txtDONGIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDONGIAActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Loại");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(109, 109, 109)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMAMONAN)
                                    .addComponent(txtTENMONAN)
                                    .addComponent(txtDONGIA)
                                    .addComponent(txtLOAITO, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGap(0, 979, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293)
                .addComponent(jLabel5)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jButton4)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMAMONAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTENMONAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtDONGIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtLOAITO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        ThucDonDTO td =new ThucDonDTO();
        td.setMAMONAN(Integer.parseInt(txtMAMONAN.getText()));
        td.setTENMONAN(txtTENMONAN.getText());
        td.setDONGIA(Integer.parseInt(txtDONGIA.getText()));
        td.setLOAITO(txtLOAITO.getText());
        
        
             if(new ThucDonDAO().addThucDonDTO(td)){
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
            dstd.add(td); // them vao danh sach SV
        } else{
            JOptionPane.showMessageDialog(rootPane, "Mã số thức ăn không được trùng lặp!");
        }
        
        showResult();
            
 

        String qry = "INSERT INTO THUCDON(MAMONAN,TENMONAN,DONGIA,LOẠITO) values(" + "'" + txtMAMONAN.getText() + "'" + "," + "'" + txtTENMONAN.getText() + "'" + "," + "'" + txtDONGIA.getText() + "'" + "," + "'" + txtLOAITO.getText() + "'" + ")";
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
         new qlThucDon().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new QuanLy().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtTENMONANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTENMONANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTENMONANActionPerformed

    private void txtDONGIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDONGIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDONGIAActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

//        ThucDonBUS bus = new ThucDonBUS();
//        if (ThucDonBUS.dstd == null) {
//            try{
//            bus.docDSTD();
//            }catch(Exception e){
//            e.printStackTrace();
//        }
//        }
//        Vector header = new Vector();
//        header.add("Mã Món Ăn");
//        header.add("Tên Món Ăn");
//        header.add("Đơn Giá");
//        header.add("Loại");
//        model = new DefaultTableModel(header, 0);
//        for (ThucDonDTO td : ThucDonBUS.dstd) {
//            Vector row = new Vector();
//            row.add(td.MAMONAN);
//            row.add(td.TENMONAN);
//            row.add(td.DONGIA);
//            row.add(td.LOAITO);
//
//            model.addRow(row);
//        }
//        tbTD.setModel(model);
        
        
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                    
        int i = tbTD.getSelectedRow();
                int selectedID = (int) tbTD.getValueAt(i, 0);
                if(i >= 0){
                                String qry = "DELETE FROM THUCDON WHERE MAMONAN=" + selectedID;
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtMAMONANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMAMONANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMAMONANActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                int i = tbTD.getSelectedRow();
                int selectedID = (int) tbTD.getValueAt(i, 0);
                if(i >= 0){    
                    String qry = "UPDATE THUCDON SET MAMONAN= " + "'" + txtMAMONAN.getText() + "'" + ", TENMONAN=" + "'" + txtTENMONAN.getText() + "'" + ", DONGIA=" + "'" + txtDONGIA.getText() + "'" + ", LOAITO=" + "'" + txtLOAITO.getText() + "'" + " WHERE MAMONAN=" + selectedID;
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
                new qlThucDon().setVisible(true);
                this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed
 int i =1;
     public void showResult() {
        ThucDonDTO td = dstd.get(dstd.size() - 1);
        model.addRow(new Object[]{
             i++, td.getTENMONAN(), td.getDONGIA(), td.getLOAITO()
        });
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
            java.util.logging.Logger.getLogger(qlThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qlThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qlThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qlThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qlThucDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTD;
    private javax.swing.JTextField txtDONGIA;
    private javax.swing.JTextField txtLOAITO;
    private javax.swing.JTextField txtMAMONAN;
    private javax.swing.JTextField txtTENMONAN;
    // End of variables declaration//GEN-END:variables
}