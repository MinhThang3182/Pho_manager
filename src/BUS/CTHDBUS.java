
package BUS;

import DAO.CTHDDAO;
import DAO.NhanVienDAO;
import DTO.CTHDDTO;
import DTO.NhanVienDTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CTHDBUS {

    
public  static  ArrayList<CTHDDTO> dscthd ;

    public CTHDBUS() {}

    public void docDSCTHD() throws Exception
    {
        CTHDDAO data = new CTHDDAO();
        if(dscthd==null) 
        {
           dscthd=new ArrayList<CTHDDTO>();
           dscthd=(ArrayList<CTHDDTO>) data.docDSCTHD();
        }
    }
}

