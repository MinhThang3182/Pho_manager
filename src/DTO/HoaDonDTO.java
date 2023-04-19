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
   public class HoaDonDTO {
   public int MAHD ;
   public int MABAN;
   public int MANV ;
   public String TENNV;
   public String TENMONAN;
   public String THOIGIAN;
   public int TONGTIEN;
    
    public HoaDonDTO(){};
    public HoaDonDTO(int MAHD, int MABAN, int MANV, String TENNV, String TENMONAN, String THOIGIAN, int TONGTIEN) {
        this.MAHD = MAHD;
        this.MABAN = MABAN;
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.TENMONAN = TENMONAN;
        this.THOIGIAN = THOIGIAN;
        this.TONGTIEN = TONGTIEN;
    }

    public int getMAHD() {
        return MAHD;
    }

    public int getMABAN() {
        return MABAN;
    }

    public int getMANV() {
        return MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public String getTENMONAN() {
        return TENMONAN;
    }


    public String getTHOIGIAN() {
        return THOIGIAN;
    }

    public int getTONGTIEN() {
        return TONGTIEN;
    }

    public void setMAHD(int MAHD) {
        this.MAHD = MAHD;
    }

    public void setMABAN(int MABAN) {
        this.MABAN = MABAN;
    }

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public void setTENMONAN(String TENMONAN) {
        this.TENMONAN = TENMONAN;
    }

    public void setTHOIGIAN(String THOIGIAN) {
        this.THOIGIAN = THOIGIAN;
    }

    public void setTONGTIEN(int TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }



    

   }