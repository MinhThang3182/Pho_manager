/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class CTHDDTO {
   public int MACTHD ;
   public int MAHD ;
   public int MABAN;
   public int MAMONAN;
   public String TENMONAN;
   public int TONGSOTIEN;
    
    public CTHDDTO(){};
    public CTHDDTO(int MACTHD, int MAHD, int MABAN, int MAMONAN, String TENMONAN, int TONGSOTIEN) {
        this.MACTHD = MACTHD;
        this.MAHD = MAHD;
        this.MABAN = MABAN;
        this.MAMONAN = MAMONAN;
        this.TENMONAN = TENMONAN;
        this.TONGSOTIEN = TONGSOTIEN;
    }

    public int getMACTHD() {
        return MACTHD;
    }

    public int getMAHD() {
        return MAHD;
    }

    public int getMABAN() {
        return MABAN;
    }

    public int getMAMONAN() {
        return MAMONAN;
    }


    public String getTENMONAN() {
        return TENMONAN;
    }


    public int getTONGSOTIEN() {
        return TONGSOTIEN;
    }

    public void setMACTHD(int MACTHD) {
        this.MACTHD = MACTHD;
    }

    public void setMAHD(int MAHD) {
        this.MAHD = MAHD;
    }

    public void setMABAN(int MABAN) {
        this.MABAN = MABAN;
    }

    public void setMAMONAN(int MAMONAN) {
        this.MAMONAN = MAMONAN;
    }

    public void setTENMONAN(String TENMONAN) {
        this.TENMONAN = TENMONAN;
    }

    public void setTONGSOTIEN(int TONGSOTIEN) {
        this.TONGSOTIEN = TONGSOTIEN;
    }

    
}

    