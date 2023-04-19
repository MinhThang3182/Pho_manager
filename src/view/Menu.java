package view;


import DAO.BanDAO;
import DAO.Connect;
import DAO.NhanVienDAO;
import DTO.BanDTO;
import DTO.NhanVienDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import static java.awt.SystemColor.menu;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

public class Menu extends javax.swing.JFrame{
    /**
     * Creates new form Menu
     */
    public Menu() {
       // initComponents();
        ThoiGian();


    }
    
    public void ThoiGian(){ 
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss  MM-dd-yyyy ");
        String strDate = dateFormat.format(date);
        lbtg.setText(strDate);
            }
   // Khóa Bằng Combobox     
//            comboTo.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent a) {
//                if (a.getItem() == "TÔ LỚN") {
//                    combo4.setEnabled(false);
//                    combo5.setEnabled(false);
//                    
//                }
//                else {
//                    combo4.setEnabled(true);
//                    combo5.setEnabled(true);
//                }
//            }
//        });


        
        
      
//    Checkbox  Khóa



       cbToDacBiet.addItemListener(new ItemListener() {
        
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == 1) {
                    combo5.setEnabled(false) ;
                }
                else {
                    combo5.setEnabled(true);
                }
                if (e.getStateChange() == 1) {
                    cbToLon.setEnabled(false) ;
                }
                else {
                    cbToLon.setEnabled(true);
                }
                if (e.getStateChange() == 1) {
                    cbToNho.setEnabled(false) ;
                }
                else {
                    cbToNho.setEnabled(true);
                }
 
              
                
            }
        }); 
//       cbToLon.addItemListener(new ItemListener() {
//        
//            public void itemStateChanged(ItemEvent e) {
//                
//                if (e.getStateChange() == 1) {
//                    combo9.setEnabled(false) ;
//                }
//                else {
//                    combo9.setEnabled(true);        
//                }
//                if (e.getStateChange() == 1) {
//                    combo8.setEnabled(false) ;
//                }
//                else {
//                    combo8.setEnabled(true);
//                }
//                
//            }
//        }); 
//       cbToNho.addItemListener(new ItemListener() {
//        
//            public void itemStateChanged(ItemEvent e) {
//                
//                if (e.getStateChange() == 1) {
//                    combo3.setEnabled(false) ;
//                }
//                else {
//                    combo3.setEnabled(true);
//                }
//                 if (e.getStateChange() == 1) {
//                    combo9.setEnabled(false) ;
//                }
//                else {
//                    combo9.setEnabled(true);
//                }
//                if (e.getStateChange() == 1) {
//                    combo5.setEnabled(false) ;
//                }
//                else {
//                    combo5.setEnabled(true);
//                } 
//                if (e.getStateChange() == 1) {
//                    cbToLon.setEnabled(false) ;
//                }
//                else {
//                    cbToLon.setEnabled(true);
//                }
//                if (e.getStateChange() == 1) {
//                    cbToDacBiet.setEnabled(false) ;
//                }
//                else {
//                    cbToDacBiet.setEnabled(true);
//                }
//            }
//        });   

//  public void checkForm1(){
//      StringBuffer sb = new StringBuffer();
//      if(cbToDacBiet.isSelected()){
//            sb.append("Tô Đặc Biệt");
//        }
//      lb1.setText(sb.toString());
//  }  
//  public void checkForm2(){
//      StringBuffer sb = new StringBuffer();
//      if(cbToLon.isSelected()){
//            sb.append("Tô Lớn");
//        }
//      lb2.setText(sb.toString());
//  }
//  
//    public void checkForm3(){
//      StringBuffer sb = new StringBuffer();
//      if(cbToLon.isSelected()){
//            sb.append("Tô Nhỏ");
//        }
//      lb3.setText(sb.toString());
//  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnXacNhan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbThitThem = new javax.swing.JCheckBox();
        cbTietHotGa = new javax.swing.JCheckBox();
        cbBanhPho = new javax.swing.JCheckBox();
        cbHotGa = new javax.swing.JCheckBox();
        cbRau = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnTo = new javax.swing.JPanel();
        cbToDacBiet = new javax.swing.JCheckBox();
        cbToNho = new javax.swing.JCheckBox();
        cbToLon = new javax.swing.JCheckBox();
        soluong1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        soluong3 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        soluong2 = new javax.swing.JSpinner();
        combo1 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        combo3 = new javax.swing.JComboBox<>();
        combo5 = new javax.swing.JComboBox<>();
        combo6 = new javax.swing.JComboBox<>();
        combo10 = new javax.swing.JComboBox<>();
        combo8 = new javax.swing.JComboBox<>();
        combo4 = new javax.swing.JComboBox<>();
        combo9 = new javax.swing.JComboBox<>();
        combo7 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboNV = new javax.swing.JComboBox<>();
        soluong4 = new javax.swing.JSpinner();
        soluong5 = new javax.swing.JSpinner();
        soluong6 = new javax.swing.JSpinner();
        soluong7 = new javax.swing.JSpinner();
        soluong8 = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        lbTG = new javax.swing.JLabel();
        lbToNho = new javax.swing.JLabel();
        lbtg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbTongTien = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb13 = new javax.swing.JLabel();
        lb14 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        lb15 = new javax.swing.JLabel();
        lb16 = new javax.swing.JLabel();
        lb17 = new javax.swing.JLabel();
        lb18 = new javax.swing.JLabel();
        lb19 = new javax.swing.JLabel();
        lb20 = new javax.swing.JLabel();
        lb22 = new javax.swing.JLabel();
        lb23 = new javax.swing.JLabel();
        lb24 = new javax.swing.JLabel();
        lb25 = new javax.swing.JLabel();
        lb26 = new javax.swing.JLabel();
        lb21 = new javax.swing.JLabel();
        lb27 = new javax.swing.JLabel();
        lb28 = new javax.swing.JLabel();
        lb29 = new javax.swing.JLabel();
        lb30 = new javax.swing.JLabel();
        lb31 = new javax.swing.JLabel();
        lb32 = new javax.swing.JLabel();
        lb33 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnXacNhan.setText("Xác nhận");
        btnXacNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Món Ăn Thêm :");

        cbThitThem.setText("Thịt Thêm");

        cbTietHotGa.setText("Tiết Hột Gà");

        cbBanhPho.setText("Bánh Phở Thêm");

        cbHotGa.setText("Hột Gà");

        cbRau.setText("Rau thêm");
        cbRau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRauActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Miễn Phí");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("5k");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("25k");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("15k");

        cbToDacBiet.setText("TÔ ĐẶC BIỆT");
        cbToDacBiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbToDacBiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbToDacBietActionPerformed(evt);
            }
        });

        cbToNho.setText("TÔ NHỎ");
        cbToNho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbToNho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbToNhoActionPerformed(evt);
            }
        });

        cbToLon.setText("TÔ LỚN");
        cbToLon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbToLon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbToLonActionPerformed(evt);
            }
        });

        soluong1.setNextFocusableComponent(cbToDacBiet);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Số lượng :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số lượng :");

        soluong3.setNextFocusableComponent(cbToDacBiet);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Số lượng :");

        soluong2.setNextFocusableComponent(cbToDacBiet);

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tái", "Nạm", "Gầu", "Gân", "Bò Viên" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nạm", "Gầu", "Gân", "Bò Viên", "Tái" }));

        combo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gầu", "Gân", "Bò Viên", "Tái", "Nạm" }));

        combo5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bò Viên", "Tái", "Nạm", "Gầu", "Gân" }));

        combo6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tái", "Nạm", "Gầu", "Gân", "Bò Viên" }));

        combo10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nạm", "Gầu", "Gân", "Bò Viên", "Tái" }));

        combo8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gầu", "Gân", "Bò Viên", "Tái", "Nạm" }));

        combo4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gân", "Bò Viên", "Tái", "Nạm", "Gầu" }));

        combo9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tái", "Nạm", "Gầu", "Gân", "Bò Viên" }));

        combo7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nạm", "Gầu", "Gân", "Bò Viên", "Tái" }));

        jLabel11.setText("75k");

        jLabel12.setText("60k");

        jLabel13.setText("45k");

        javax.swing.GroupLayout pnToLayout = new javax.swing.GroupLayout(pnTo);
        pnTo.setLayout(pnToLayout);
        pnToLayout.setHorizontalGroup(
            pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnToLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addComponent(cbToLon, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addComponent(cbToNho, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addComponent(cbToDacBiet)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)))
                .addGap(53, 53, 53)
                .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addComponent(combo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(combo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(combo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addComponent(combo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(soluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(soluong3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(soluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnToLayout.setVerticalGroup(
            pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnToLayout.createSequentialGroup()
                .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnToLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbToDacBiet)
                                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(14, 14, 14)
                                .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbToLon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(soluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnToLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(combo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soluong3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnToLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(pnToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbToNho)
                            .addComponent(combo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel10.setText("Nhân Viên");

        comboNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Võ Minh Thắng", "Tăng Ái Quốc", "Lê Nguyễn Việt Hoàng" }));

        soluong4.setNextFocusableComponent(cbToDacBiet);

        soluong5.setNextFocusableComponent(cbToDacBiet);

        soluong6.setNextFocusableComponent(cbToDacBiet);

        soluong7.setNextFocusableComponent(cbToDacBiet);

        soluong8.setNextFocusableComponent(cbToDacBiet);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbRau)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(soluong4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbBanhPho)
                                    .addComponent(cbHotGa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soluong6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soluong5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(cbTietHotGa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soluong7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbThitThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soluong8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(comboNV, 0, 196, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbRau)
                                .addComponent(soluong4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbThitThem)
                                .addComponent(cbTietHotGa)
                                .addComponent(soluong7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(soluong8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbBanhPho, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soluong5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbHotGa)
                            .addComponent(soluong6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/logo/Screenshot 2021-03-18 142447.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("Phở Gia Truyền");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel18.setText("Nhà tôi 3 đời nấu Phở");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Đăng kí dịch vụ tại : phogiatruyen.com ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Hotline: 0762870272");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/logo/LOGO MENU.png"))); // NOI18N

        jButton6.setText("Thêm món");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lbTG.setBackground(new java.awt.Color(102, 255, 204));
        lbTG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTG.setText("THỜI GIAN :");

        lbtg.setBackground(new java.awt.Color(102, 255, 204));
        lbtg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Tên Món Ăn");

        lbTongTien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTongTien.setForeground(new java.awt.Color(255, 51, 0));
        lbTongTien.setText("Tổng tền :");

        lb10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb10.setForeground(new java.awt.Color(255, 51, 0));

        lb14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb14.setText("Giá");

        lb15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb15.setText("Món ăn thêm :");

        lb26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb26.setText("Giá");

        lb27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb27.setText("Số Lượng");

        lb28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb28.setText("Số Lượng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb15, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb31, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb33, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb32, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb30, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb29, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lb26, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb23, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb25, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb24, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb22, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb21, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGap(274, 274, 274))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(lb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lb5, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(lb6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb27)
                    .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lb14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addComponent(lb13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(lb16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(lb17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lb19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lb29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lb30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lb31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lb32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(lb33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lb21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lb22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lb24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lb25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234)
                                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(668, 668, 668)
                        .addComponent(lbToNho, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbTG, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbtg, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTG, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbtg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lbToNho, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(66, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Thức ăn", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jCheckBox1.setText("Nước suối");

        jCheckBox2.setText("Trà đá");

        jCheckBox3.setText("7 Up");

        jCheckBox4.setText("Bia");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Pepsi");

        jCheckBox6.setText("Sá xị");

        jCheckBox7.setText("Cà phê");

        jCheckBox8.setText("Sting");

        jCheckBox9.setText("Sữa");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/ThucUong/7up.jpg"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/ThucUong/caphe.jpg"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/ThucUong/download.png"))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/ThucUong/Nước-tinh-khiết-Aquafina-1.5L.png"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/ThucUong/TraDa.png"))); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/ThucUong/pepsi.png"))); // NOI18N

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/ThucUong/sting-dau.png"))); // NOI18N

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/ThucUong/sa xi.jpg"))); // NOI18N

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/ThucUong/huong-sua.jpg"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jCheckBox3)
                        .addGap(278, 278, 278)
                        .addComponent(jCheckBox1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jCheckBox4)))
                        .addGap(60, 60, 60)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jCheckBox5))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jCheckBox7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox8)
                        .addGap(57, 57, 57)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jCheckBox6)
                        .addGap(252, 252, 252))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(jCheckBox2))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(jCheckBox9)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 235, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox7)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, Short.MAX_VALUE)))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBox5)
                                .addComponent(jCheckBox9))
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox8))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(749, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thức uống", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbRauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRauActionPerformed

    private void cbToLonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToLonActionPerformed
        // TODO add your handling code here:
//        checkForm2();
    }//GEN-LAST:event_cbToLonActionPerformed

    private void cbToNhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToNhoActionPerformed
        // TODO add your handling code here:
 //       checkForm3();
    }//GEN-LAST:event_cbToNhoActionPerformed

    private void cbToDacBietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToDacBietActionPerformed
        // TODO add your handling code here:
 //       checkForm1();
//        if(cbToDacBiet.isSelected()){
//            cbToDacBiet.getText();
//        }
    }//GEN-LAST:event_cbToDacBietActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
               // TODO add your handling code here:
        String qry = "DELETE FROM HD WHERE MAHD=(select max(MAHD) From HD Where MAHD <100000000) "
                + "DELETE FROM CTHD WHERE MACTHD =(select max(MACTHD) From CTHD Where MACTHD <100000000)" ;

                                System.out.println(qry);
                                Connect conn = new Connect();
                            try{

                                try(Statement st = conn.conn.createStatement()){
                                    st.executeUpdate(qry);
                                    }
                                }

                            catch(SQLException e){
                                System.out.println(e.getMessage());
                                                  }
                            
                            
                            
                     System.exit(0);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        
//        if(cbToDacBiet.isSelected()&& cbToLon.isSelected()&&cbToNho.isSelected()){
//        String Query = "INSERT INTO CTHD(MAMONAN) values("+ "'" +"1" + "'" + ")";
//        System.out.println(Query);
//        Connect conn = new Connect();
//        try{
//
//            try(Statement st = conn.conn.createStatement()){
//                st.executeUpdate(Query);
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//        }

       String qry1 = "UPDATE HD SET THOIGIAN = " +"'" + lbtg.getText() + "'" +"WHERE MAHD =(select max(MAHD) From HD Where MAHD <100000000)";     
       System.out.println(qry1);
        Connect conn1 = new Connect();
        try{

            try(Statement st = conn1.conn.createStatement()){
                st.executeUpdate(qry1);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
       String qry2 = "UPDATE HD SET TENNV = " +"N'" + comboNV.getSelectedItem()+"'"+", MANV ="+"'"+ comboNV.getSelectedIndex()+"'" + "+ 1 WHERE MAHD =(select max(MAHD) From HD Where MAHD <100000000)";
       System.out.println(qry2);
        Connect conn2 = new Connect();
        try{

            try(Statement st = conn1.conn.createStatement()){
                st.executeUpdate(qry2);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
      
       String Query = "UPDATE HD SET TENMONAN = " + "N'" + lb1.getText() +"("+ lb4.getText() + ")"+ "("+ lb7.getText() +")"+ "+" + lb2.getText() +"("+ lb5.getText() + ")"+ "("+ lb8.getText() +")"+"+" + lb3.getText() +"("+ lb6.getText() + ")"+ "("+ lb9.getText() +")"+" "+ lb16.getText()+ "("+ lb29.getText() +")" +" "+ lb17.getText()+ "("+ lb30.getText() +")"+" "+ lb18.getText()+ "("+ lb31.getText() +")"+" "+ lb19.getText()+ "("+ lb32.getText() +")"+" "+ lb20.getText()+ "("+ lb33.getText() +")" + "'" + ",TONGTIEN ="+ "'" + lb10.getText() + "'" +"WHERE MAHD =(select max(MAHD) From HD Where MAHD <100000000)";
       
       System.out.println(Query);
        Connect conn = new Connect();
        try{

            try(Statement st = conn.conn.createStatement()){
                st.executeUpdate(Query);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
       new GiaoDienBan().setVisible(true);
       this.dispose();
       
       
       
        

    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here
            String value1 = soluong1.getValue().toString();
            String value2 = soluong2.getValue().toString();
            String value3 = soluong3.getValue().toString();
            String value4 = soluong4.getValue().toString();
            String value5 = soluong5.getValue().toString();
            String value6 = soluong6.getValue().toString();
            String value7 = soluong7.getValue().toString();
            String value8 = soluong8.getValue().toString();
            
            int a = Integer.parseInt(value1);
            int b = Integer.parseInt(value2);
            int c = Integer.parseInt(value3);
            int d = Integer.parseInt(value4);
            int e = Integer.parseInt(value5);
            int f = Integer.parseInt(value6);
            int g = Integer.parseInt(value7);
            int h = Integer.parseInt(value8);
            
            int giatodacbiet = a*75000;
            int giatolon = b*60000; 
            int giatonho = c*45000;
            
            int giarau = d*0;
            int giahotga = e*5000;
            int giabanhpho = f*5000;
            int giatiethotga = g*15000;
            int giathitthem = h*25000;
            
            
 //           int giamonanthem = hg ;
            int tongtien = giatodacbiet + giatolon + giatonho + giarau +giahotga+giabanhpho+giatiethotga+giathitthem;
            
            lb10.setText(String.valueOf(tongtien));
            
        if(cbToDacBiet.isSelected()){
            
        lb7.setText(String.valueOf(value1));
        
        lb11.setText(String.valueOf(giatodacbiet));
        
        String cbTDB = cbToDacBiet.getText().toString();
        lb1.setText(String.valueOf(cbTDB));
            
        String cbToDacBiet = "Phở "+ combo1.getSelectedItem().toString() +" "+ combo2.getSelectedItem().toString()+" "+ combo3.getSelectedItem().toString()+" "+ combo4.getSelectedItem().toString()+" "+ combo5.getSelectedItem().toString();
        lb4.setText(String.valueOf(cbToDacBiet));
        }
        
        
        if(cbToLon.isSelected()){
        lb8.setText(String.valueOf(value2));
        
        lb12.setText(String.valueOf(giatolon));
        
        String cbTL = cbToLon.getText().toString();
        lb2.setText(String.valueOf(cbTL));
            
        String cbToLon ="Phở "+ combo6.getSelectedItem().toString() +" "+ combo7.getSelectedItem().toString()+" "+ combo8.getSelectedItem().toString();
        lb5.setText(String.valueOf(cbToLon));
        }
        
        
        
        if(cbToNho.isSelected()){  
        lb9.setText(String.valueOf(value3));
        
        lb13.setText(String.valueOf(giatonho));
        
        String cbTN = cbToNho.getText().toString();
        lb3.setText(String.valueOf(cbTN));  
            
        String cbToNho ="Phở"+ combo9.getSelectedItem().toString() +" "+ combo10.getSelectedItem().toString();
        lb6.setText(String.valueOf(cbToNho));
        }
        
        if(cbRau.isSelected()){
         
        lb29.setText(String.valueOf(value4));
        
        lb21.setText(String.valueOf(giarau));
   
        String cbR = cbRau.getText().toString();
        lb16.setText(String.valueOf(cbR));  
        }
        
        if(cbBanhPho.isSelected()){
        lb30.setText(String.valueOf(value5));
            
        lb22.setText(String.valueOf(giabanhpho));

 
        String cbBP = cbBanhPho.getText().toString();
        lb17.setText(String.valueOf(cbBP));  
        }
        
        if(cbHotGa.isSelected()){
        lb31.setText(String.valueOf(value6));    
            
        lb23.setText(String.valueOf(giahotga));
            
        String cbHG = cbHotGa.getText().toString();
        
        lb18.setText(String.valueOf(cbHG));  
        }
        
        if(cbTietHotGa.isSelected()){
           
        lb32.setText(String.valueOf(value7));
        lb24.setText(String.valueOf(giatiethotga));  
        String cbTHG = cbTietHotGa.getText().toString();
        lb19.setText(String.valueOf(cbTHG));  
        }
        
        if(cbThitThem.isSelected()){
        lb33.setText(String.valueOf(value8));
        lb25.setText(String.valueOf(giathitthem)); 
        String cbTT = cbThitThem.getText().toString();
        lb20.setText(String.valueOf(cbTT));  
        }
        
           
            
        
                             

               
        


            
   //if(combo1.getSelectedIndex()==0 && combo2.getSelectedIndex()==0 ){         

//              if(cbToDacBiet.isEnabled()){            
//        String Query = "INSERT INTO GOIMON(TENMONAN, TONGTIEN) values("+ "N"+"'" + cbToDacBiet.getText()+"("+ combo1.getSelectedItem()+ combo2.getSelectedItem()+ combo3.getSelectedItem()+ combo4.getSelectedItem()+ combo5.getSelectedItem()+")"+ "("+ soluong1.getValue()+")"+ "'" + "," + "'" + giatodacbiet + "'" + ")";
//        System.out.println(Query);
//        Connect conn = new Connect();
//        try{
//
//            try(Statement st = conn.conn.createStatement()){
//                st.executeUpdate(Query);
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//              }
//              
//        if(cbToDacBiet.isSelected() && cbToLon.isSelected() ){
//            int giatolonvatodacbiet = a*75000 + b*60000;
//        String Query = "INSERT INTO GOIMON(TENMONAN, TONGTIEN) values("+ "N"+"'" + cbToDacBiet.getText()+ combo1.getSelectedItem()+ combo2.getSelectedItem()+ combo3.getSelectedItem()+ combo4.getSelectedItem()+ combo5.getSelectedItem()+ "("+ soluong1.getValue()+")"+"," + cbToLon.getText()+ combo6.getSelectedItem()+ combo7.getSelectedItem()+ combo8.getSelectedItem()+ "("+ soluong2.getValue()+")"+ "'" + "," + "'" + giatolonvatodacbiet + "'" + ")";
//        System.out.println(Query);
//        Connect conn = new Connect();
//        try{
//
//            try(Statement st = conn.conn.createStatement()){
//                st.executeUpdate(Query);
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//        
//              }
//              
//              
//          if(cbToLon.isSelected()){
//        String Query = "INSERT INTO GOIMON(TENMONAN, TONGTIEN) values("+ "N"+"'" + cbToLon.getText()+ combo6.getSelectedItem()+ combo7.getSelectedItem()+ combo8.getSelectedItem()+ "(" + soluong2.getValue()+")"+"'"+ "," + "'" + giatolon + "'" + ")";
//        System.out.println(Query);
//        Connect conn = new Connect();
//        try{
//
//            try(Statement st = conn.conn.createStatement()){
//                st.executeUpdate(Query);
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//              }
//            
//            
//          else if(cbToNho.isSelected()){
//        String Query = "INSERT INTO GOIMON(TENMONAN, TONGTIEN) values("+ "N"+"'" + cbToNho.getText()+ combo9.getSelectedItem()+ combo10.getSelectedItem()+ "(" + soluong3.getValue()+")"+"'" +"," + "'" + giatonho + "'" + ")";
//        System.out.println(Query);
//        Connect conn = new Connect();
//        try{
//
//            try(Statement st = conn.conn.createStatement()){
//                st.executeUpdate(Query);
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//              }
//              
//            if(cbToDacBiet.isSelected()&& cbToLon.isSelected() ){
//            int giatolonvatodacbiet = a*75000 + b*60000;
//        String Query = "INSERT INTO GOIMON(TENMONAN, TONGTIEN) values("+ "N"+"'" + cbToDacBiet.getText()+ combo1.getSelectedItem()+ combo2.getSelectedItem()+ combo3.getSelectedItem()+ combo4.getSelectedItem()+ combo5.getSelectedItem()+ "("+ soluong1.getValue()+")"+"," + cbToLon.getText()+ combo6.getSelectedItem()+ combo7.getSelectedItem()+ combo8.getSelectedItem()+ "("+ soluong2.getValue()+")"+ "'" + "," + "'" + giatolonvatodacbiet + "'" + ")";
//        System.out.println(Query);
//        Connect conn = new Connect();
//        try{
//
//            try(Statement st = conn.conn.createStatement()){
//                st.executeUpdate(Query);
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//              }
//            
//            
//           else if(cbToDacBiet.isSelected() && cbToLon.isSelected()){
//            int giatolonvatodacbiet = a*75000 + b*60000;
//        String Query = "INSERT INTO GOIMON(TENMONAN, TONGTIEN) values("+ "N"+"'" + cbToDacBiet.getText()+ combo1.getSelectedItem()+ combo2.getSelectedItem()+ combo3.getSelectedItem()+ combo4.getSelectedItem()+ combo5.getSelectedItem()+ "("+ soluong1.getValue()+")"+"," + cbToLon.getText()+ combo6.getSelectedItem()+ combo7.getSelectedItem()+ combo8.getSelectedItem()+ "("+ soluong2.getValue()+")"+ "'" + "," + "'" + giatolonvatodacbiet + "'" + ")";
//        System.out.println(Query);
//        Connect conn = new Connect();
//        try{
//
//            try(Statement st = conn.conn.createStatement()){
//                st.executeUpdate(Query);
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//              }
//            
//           else if(cbToDacBiet.isSelected() && cbToNho.isSelected()){
//            int giatonhovatodacbiet = a*75000 + c*45000;
//        String Query = "INSERT INTO GOIMON(TENMONAN, TONGTIEN) values("+ "N"+"'" + cbToDacBiet.getText()+ combo1.getSelectedItem()+ combo2.getSelectedItem()+ combo3.getSelectedItem()+ combo4.getSelectedItem()+ combo5.getSelectedItem()+ "("+ soluong1.getValue()+")"+"," + cbToNho.getText()+ combo9.getSelectedItem()+ combo10.getSelectedItem()+ "("+ soluong3.getValue()+")"+ "'" + "," + "'" + giatonhovatodacbiet + "'" + ")";
//        System.out.println(Query);
//        Connect conn = new Connect();
//        try{
//
//            try(Statement st = conn.conn.createStatement()){
//                st.executeUpdate(Query);
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//              }
//            
//           else if(cbToLon.isSelected() && cbToNho.isSelected()){
//            int giatonhovatolon = b*60000 + c*45000;
//        String Query = "INSERT INTO GOIMON(TENMONAN, TONGTIEN) values("+ "N"+"'" + cbToLon.getText()+ combo6.getSelectedItem()+ combo7.getSelectedItem()+ combo8.getSelectedItem()+ "(" + soluong2.getValue()+")"+ "," + cbToNho.getText()+ combo9.getSelectedItem()+ combo10.getSelectedItem()+ "("+ soluong3.getValue()+")"+ "'" + "," + "'" + giatonhovatolon + "'" + ")";
//        System.out.println(Query);
//        Connect conn = new Connect();
//        try{
//
//            try(Statement st = conn.conn.createStatement()){
//                st.executeUpdate(Query);
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//              }
//             
//           else if(cbToDacBiet.isSelected() && cbToLon.isSelected() && cbToNho.isSelected()){
//            int gia3to = a*75000 + b*60000 + c*45000;
//        String Query = "INSERT INTO GOIMON(TENMONAN, TONGTIEN) values("+ "N"+"'" + cbToDacBiet.getText()+ combo1.getSelectedItem()+ combo2.getSelectedItem()+ combo3.getSelectedItem()+ combo4.getSelectedItem()+ combo5.getSelectedItem()+ "("+ soluong1.getValue()+")"+ ";" + cbToLon.getText()+ combo6.getSelectedItem()+ combo7.getSelectedItem()+ combo8.getSelectedItem()+ "("+ soluong2.getValue()+")"+";" + cbToNho.getText()+ combo9.getSelectedItem()+ combo10.getSelectedItem()+ "("+ soluong3.getValue()+")"+ "'" + "," + "'" + gia3to + "'" + ")";
//        System.out.println(Query);
//        Connect conn = new Connect();
//        try{
//
//            try(Statement st = conn.conn.createStatement()){
//                st.executeUpdate(Query);
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//              }
              

          
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:      
        

        
        
    }//GEN-LAST:event_combo1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JCheckBox cbBanhPho;
    private javax.swing.JCheckBox cbHotGa;
    private javax.swing.JCheckBox cbRau;
    private javax.swing.JCheckBox cbThitThem;
    private javax.swing.JCheckBox cbTietHotGa;
    private javax.swing.JCheckBox cbToDacBiet;
    private javax.swing.JCheckBox cbToLon;
    private javax.swing.JCheckBox cbToNho;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo10;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JComboBox<String> combo3;
    private javax.swing.JComboBox<String> combo4;
    private javax.swing.JComboBox<String> combo5;
    private javax.swing.JComboBox<String> combo6;
    private javax.swing.JComboBox<String> combo7;
    private javax.swing.JComboBox<String> combo8;
    private javax.swing.JComboBox<String> combo9;
    private javax.swing.JComboBox<String> comboNV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb16;
    private javax.swing.JLabel lb17;
    private javax.swing.JLabel lb18;
    private javax.swing.JLabel lb19;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb20;
    private javax.swing.JLabel lb21;
    private javax.swing.JLabel lb22;
    private javax.swing.JLabel lb23;
    private javax.swing.JLabel lb24;
    private javax.swing.JLabel lb25;
    private javax.swing.JLabel lb26;
    private javax.swing.JLabel lb27;
    private javax.swing.JLabel lb28;
    private javax.swing.JLabel lb29;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb30;
    private javax.swing.JLabel lb31;
    private javax.swing.JLabel lb32;
    private javax.swing.JLabel lb33;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lbTG;
    private javax.swing.JLabel lbToNho;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JLabel lbtg;
    private javax.swing.JPanel pnTo;
    private javax.swing.JSpinner soluong1;
    private javax.swing.JSpinner soluong2;
    private javax.swing.JSpinner soluong3;
    private javax.swing.JSpinner soluong4;
    private javax.swing.JSpinner soluong5;
    private javax.swing.JSpinner soluong6;
    private javax.swing.JSpinner soluong7;
    private javax.swing.JSpinner soluong8;
    // End of variables declaration//GEN-END:variables
int i =1;

   
    


}


    

