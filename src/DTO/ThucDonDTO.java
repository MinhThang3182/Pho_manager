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
public class ThucDonDTO {    
    public int MAMONAN;
    public String TENMONAN;
    public int DONGIA;
    public String LOAITO;
    
    public ThucDonDTO(){}
    public ThucDonDTO(int MAMONAN, String TENMONAN, int DONGIA, String LOAITO) {
        this.MAMONAN = MAMONAN;
        this.TENMONAN = TENMONAN;
        this.DONGIA = DONGIA;
        this.LOAITO = LOAITO;
    }

    public int getMAMONAN() {
        return MAMONAN;
    }

    public String getTENMONAN() {
        return TENMONAN;
    }

    public int getDONGIA() {
        return DONGIA;
    }

    public String getLOAITO() {
        return LOAITO;
    }

    public void setMAMONAN(int MAMONAN) {
        this.MAMONAN = MAMONAN;
    }

    public void setTENMONAN(String TENMONAN) {
        this.TENMONAN = TENMONAN;
    }

    public void setDONGIA(int DONGIA) {
        this.DONGIA = DONGIA;
    }

    public void setLOAITO(String LOAITO) {
        this.LOAITO = LOAITO;
    }
    

    


}