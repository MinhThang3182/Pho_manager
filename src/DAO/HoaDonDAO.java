
package DAO;

import DTO.HoaDonDTO;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class HoaDonDAO extends Connect  {
     public ArrayList docDSHD() {
        ArrayList dshd = new ArrayList<HoaDonDTO>();
        try {
            String qry = "select*from HD";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                HoaDonDTO hd = new HoaDonDTO();
                hd.MAHD = rs.getInt(1);
                hd.MABAN = rs.getInt(2);
                hd.MANV = rs.getInt(3);
                hd.TENNV = rs.getString(4);
                hd.TENMONAN = rs.getString(5);
                hd.THOIGIAN = rs.getString(6);
                hd.TONGTIEN = rs.getInt(7);
                dshd.add(hd);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
        return dshd;
   }
}
