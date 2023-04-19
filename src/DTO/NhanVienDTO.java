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
public class NhanVienDTO {
    public int MANV;
    public String TENNV;
    public int NAMSINH;
    public String SDT;
    
public NhanVienDTO(){};
    public NhanVienDTO(int MANV, String TENNV, int NAMSINH, String SDT) {
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.NAMSINH = NAMSINH;
        this.SDT = SDT;
    }

    public int getMANV() {
        return MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public int getNAMSINH() {
        return NAMSINH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public void setNAMSINH(int NAMSINH) {
        this.NAMSINH = NAMSINH;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
