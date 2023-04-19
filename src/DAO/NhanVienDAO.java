 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhanVienDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.NhanVien;

/**
 *
 * @author Admin
 */


      
   public class NhanVienDAO extends Connect {
           public boolean addNhanVienDTO (NhanVienDTO nv){
        
        String qry = "INSERT INTO NVIEN(MANV, TENNV, NAMSINH, SDT) "
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, nv.getMANV());
            ps.setString(2, nv.getTENNV());
//            ps.setDate(3, new Date(s.getDob().getTime()));
            ps.setInt(3, nv.getNAMSINH());
            ps.setString(4, nv.getSDT());
            return ps.executeUpdate()> 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
           
           
   public ArrayList docDSNV() {
        ArrayList dsnv = new ArrayList<NhanVienDTO>();
        try {
            String qry = "select*from NVIEN";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                NhanVienDTO nv = new NhanVienDTO();
                nv.MANV = rs.getInt(1);
                nv.TENNV = rs.getString(2);
                nv.NAMSINH = rs.getInt(3);
                nv.SDT = rs.getString(4);
                        
                dsnv.add(nv);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
        return dsnv;
   }
   }




