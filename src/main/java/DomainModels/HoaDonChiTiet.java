/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "IdHoaDon")
    private HoaDon IdHoaDon;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "IdChiTietSP")
    private ChiTietSP IdChiTietSP;
    
     private int SoLuong;
    private BigDecimal DonGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(HoaDon IdHoaDon, ChiTietSP IdChiTietSP, int SoLuong, BigDecimal DonGia) {
        this.IdHoaDon = IdHoaDon;
        this.IdChiTietSP = IdChiTietSP;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public HoaDon getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(HoaDon IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }

    public ChiTietSP getIdChiTietSP() {
        return IdChiTietSP;
    }

    public void setIdChiTietSP(ChiTietSP IdChiTietSP) {
        this.IdChiTietSP = IdChiTietSP;
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
        return "HoaDonChiTiet{" + "IdHoaDon=" + IdHoaDon + ", IdChiTietSP=" + IdChiTietSP + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }
    
    
}
