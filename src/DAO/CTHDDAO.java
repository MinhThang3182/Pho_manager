
package DAO;

import DTO.CTHDDTO;
import DTO.NhanVienDTO;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CTHDDAO extends Connect  {
     public ArrayList docDSCTHD() {
        ArrayList dscthd = new ArrayList<CTHDDTO>();
        try {
            String qry = "select*from CTHD";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                CTHDDTO cthd = new CTHDDTO();
                cthd.MACTHD = rs.getInt(1);
                cthd.MAHD = rs.getInt(2);
                cthd.MABAN = rs.getInt(3);
                cthd.MAMONAN = rs.getInt(4);
                cthd.TENMONAN = rs.getString(5);
                cthd.TONGSOTIEN = rs.getInt(6);

                dscthd.add(cthd);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
        return dscthd;
   }
}

