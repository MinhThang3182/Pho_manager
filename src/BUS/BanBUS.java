
package BUS;

import DAO.BanDAO;
import DTO.BanDTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BanBUS {
    public  static  ArrayList<BanDTO> dsb ;

    public BanBUS() {}

    public void docDSB() throws Exception
    {
        BanDAO data = new BanDAO();
        if(dsb==null) 
        {
           dsb=new ArrayList<BanDTO>();
           dsb=(ArrayList<BanDTO>) data.docDSB();
        }
    }
}
