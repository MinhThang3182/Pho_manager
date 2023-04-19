
package DAO;

import DTO.NhanVienDTO;
import DTO.ThucDonDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */  
   public class ThucDonDAO extends Connect {
       

           public boolean addThucDonDTO (ThucDonDTO td){
        
        String qry = "INSERT INTO THUCDON(MAMONAN, TENMONAN, DONGIA, LOAITO) "
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, td.getMAMONAN());
            ps.setString(2, td.getTENMONAN());
//            ps.setDate(3, new Date(s.getDob().getTime()));
            ps.setInt(3, td.getDONGIA());
            ps.setString(4, td.getLOAITO());
            return ps.executeUpdate()> 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
       
       
       
   public ArrayList docDSTD() {
        ArrayList dstd = new ArrayList<ThucDonDTO>();
        try {
            String qry = "select*from THUCDON";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
               ThucDonDTO td = new ThucDonDTO();
                td.MAMONAN = rs.getInt(1);
                td.TENMONAN = rs.getString(2);
                td.DONGIA= rs.getInt(3);
                td.LOAITO = rs.getString(4);
                        
                dstd.add(td);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
        return dstd;
   }
   }



