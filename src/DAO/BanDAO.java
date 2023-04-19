
package DAO;

import DTO.BanDTO;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
   public class BanDAO extends Connect {
   public ArrayList docDSB() {
        ArrayList dsb = new ArrayList<BanDTO>();
        try {
            String qry = "select*from BAN";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                BanDTO b = new BanDTO();
                b.MABAN = rs.getInt(1);
                b.LOAIBAN = rs.getString(2);
                b.TRANGTHAI = rs.getString(3);
                        
                dsb.add(b);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "L");
        }
        return dsb;
    }
}
