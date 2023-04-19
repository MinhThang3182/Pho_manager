
package BUS;

import DAO.ThucDonDAO;
import DTO.ThucDonDTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ThucDonBUS {
    public  static  ArrayList<ThucDonDTO> dstd ;

    public ThucDonBUS() {}

    public void docDSTD() throws Exception
    {
        ThucDonDAO data = new ThucDonDAO();
        if(dstd==null) 
        {
           dstd=new ArrayList<ThucDonDTO>();
           dstd=(ArrayList<ThucDonDTO>) data.docDSTD();
        }
    }
}

