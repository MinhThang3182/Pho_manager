
package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDonDTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDonBUS {

public  static  ArrayList<HoaDonDTO> dshd ;

    public HoaDonBUS() {}

    public void docDSHD() throws Exception
    {
        HoaDonDAO data = new HoaDonDAO();
        if(dshd==null) 
        {
           dshd=new ArrayList<HoaDonDTO>();
           dshd=(ArrayList<HoaDonDTO>) data.docDSHD();
        }
    }
}



