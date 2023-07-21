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
public class QLChiTietSP {
     private String Id;
      private String IdSP;
      private String IdNsx;
      private String IdMauSac;
      private String IdLoaiSP;
      private String IdChatLieu;
      private String IdSize;
      private String NamBH;
      private String MoTa;
      private int SoLuongTon;
      private BigDecimal GiaNhap;
      private BigDecimal GiaBan;
      private String TrangThai;

    public QLChiTietSP() {
    }

    public QLChiTietSP(String Id, String IdSP, String IdNsx, String IdMauSac, String IdLoaiSP, String IdChatLieu, String IdSize, String NamBH, String MoTa, int SoLuongTon, BigDecimal GiaNhap, BigDecimal GiaBan, String TrangThai) {
        this.Id = Id;
        this.IdSP = IdSP;
        this.IdNsx = IdNsx;
        this.IdMauSac = IdMauSac;
        this.IdLoaiSP = IdLoaiSP;
        this.IdChatLieu = IdChatLieu;
        this.IdSize = IdSize;
        this.NamBH = NamBH;
        this.MoTa = MoTa;
        this.SoLuongTon = SoLuongTon;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getIdSP() {
        return IdSP;
    }

    public void setIdSP(String IdSP) {
        this.IdSP = IdSP;
    }

    public String getIdNsx() {
        return IdNsx;
    }

    public void setIdNsx(String IdNsx) {
        this.IdNsx = IdNsx;
    }

    public String getIdMauSac() {
        return IdMauSac;
    }

    public void setIdMauSac(String IdMauSac) {
        this.IdMauSac = IdMauSac;
    }

    public String getIdLoaiSP() {
        return IdLoaiSP;
    }

    public void setIdLoaiSP(String IdLoaiSP) {
        this.IdLoaiSP = IdLoaiSP;
    }

    public String getIdChatLieu() {
        return IdChatLieu;
    }

    public void setIdChatLieu(String IdChatLieu) {
        this.IdChatLieu = IdChatLieu;
    }

    public String getIdSize() {
        return IdSize;
    }

    public void setIdSize(String IdSize) {
        this.IdSize = IdSize;
    }

    public String getNamBH() {
        return NamBH;
    }

    public void setNamBH(String NamBH) {
        this.NamBH = NamBH;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public BigDecimal getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(BigDecimal GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public BigDecimal getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(BigDecimal GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "QLChiTietSP{" + "Id=" + Id + ", IdSP=" + IdSP + ", IdNsx=" + IdNsx + ", IdMauSac=" + IdMauSac + ", IdLoaiSP=" + IdLoaiSP + ", IdChatLieu=" + IdChatLieu + ", IdSize=" + IdSize + ", NamBH=" + NamBH + ", MoTa=" + MoTa + ", SoLuongTon=" + SoLuongTon + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", TrangThai=" + TrangThai + '}';
    }
      
      
      
}
