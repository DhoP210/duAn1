/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.math.BigDecimal;

/**
 *
 * @author ASUS
 */
public class QLCTHoaDon {
    private String IdHoaDon;
    private String IdChiTietSP;
    private String ten;
    private int SoLuong;
    private BigDecimal DonGia;

    public QLCTHoaDon() {
    }

    public QLCTHoaDon(String IdHoaDon, String IdChiTietSP, String ten, int SoLuong, BigDecimal DonGia) {
        this.IdHoaDon = IdHoaDon;
        this.IdChiTietSP = IdChiTietSP;
        this.ten = ten;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(String IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }

    public String getIdChiTietSP() {
        return IdChiTietSP;
    }

    public void setIdChiTietSP(String IdChiTietSP) {
        this.IdChiTietSP = IdChiTietSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public BigDecimal getDonGia() {
        return DonGia;
    }

    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

    @Override
    public String toString() {
        return "QLCTHoaDon{" + "IdHoaDon=" + IdHoaDon + ", IdChiTietSP=" + IdChiTietSP + ", ten=" + ten + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }
    
    
}
