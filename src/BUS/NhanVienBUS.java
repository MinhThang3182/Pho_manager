
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class NhanVienBUS {
    
public  static  ArrayList<NhanVienDTO> dsnv ;

    public NhanVienBUS() {}

    public void docDSNV() throws Exception
    {
        NhanVienDAO data = new NhanVienDAO();
        if(dsnv==null) 
        {
           dsnv=new ArrayList<NhanVienDTO>();
           dsnv=(ArrayList<NhanVienDTO>) data.docDSNV();
        }
    }
}


