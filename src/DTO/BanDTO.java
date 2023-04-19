
package DTO;

/**
 *
 * @author Admin
 */
public class BanDTO {
    
    public int MABAN;
    public String LOAIBAN;
    public String TRANGTHAI;
    
    public BanDTO(){};
    public BanDTO(int MABAN, String LOAIBAN, String TRANGTHAI) {
        this.MABAN = MABAN;
        this.LOAIBAN = LOAIBAN;
        this.TRANGTHAI = TRANGTHAI;
    }

    public int getMABAN() {
        return MABAN;
    }

    public String getLOAIBAN() {
        return LOAIBAN;
    }

    public String getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setMABAN(int MABAN) {
        this.MABAN = MABAN;
    }

    public void setLOAIBAN(String LOAIBAN) {
        this.LOAIBAN = LOAIBAN;
    }

    public void setTRANGTHAI(String TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }

}

