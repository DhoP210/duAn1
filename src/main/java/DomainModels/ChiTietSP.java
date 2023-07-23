/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author ASUS
 */
@Entity
@Getter
@Setter
@Table(name = "ChiTietSP")
public class ChiTietSP implements Serializable{
    @Id
    @Column(name = "Id", columnDefinition = "UNIQUEIDENTIFIER")
    @GeneratedValue
    private String Id;
    
    @ManyToOne
    @JoinColumn(name = "IdSP")
    private SanPham IdSanPham;

    @ManyToOne
    @JoinColumn(name = "IdNsx")
    private NSX IdNhaSanXuat;
    
    @ManyToOne
    @JoinColumn(name = "IdMauSac")
    private MauSac IdMauSac;

    @ManyToOne
    @JoinColumn(name = "IdLoaiSP")
    private LoaiSP IdLoaiSP;
    
    @ManyToOne
    @JoinColumn(name = "IdChatLieu")
    private ChatLieu IdChatLieu;
    
    @ManyToOne
    @JoinColumn(name = "IdSize")
    private Size IdSize;
    
    private int NamBH;
    private String MoTa;
    private int SoLuongTon;
    private BigDecimal GiaNhap;
    private BigDecimal GiaBan;
    private int TrangThai;

    public ChiTietSP() {
    }

    public ChiTietSP(String Id, SanPham IdSanPham, NSX IdNhaSanXuat, MauSac IdMauSac, LoaiSP IdLoaiSP, ChatLieu IdChatLieu, Size IdSize, int NamBH, String MoTa, int SoLuongTon, BigDecimal GiaNhap, BigDecimal GiaBan, int TrangThai) {
        this.Id = Id;
        this.IdSanPham = IdSanPham;
        this.IdNhaSanXuat = IdNhaSanXuat;
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

    public SanPham getIdSanPham() {
        return IdSanPham;
    }

    public void setIdSanPham(SanPham IdSanPham) {
        this.IdSanPham = IdSanPham;
    }

    public NSX getIdNhaSanXuat() {
        return IdNhaSanXuat;
    }

    public void setIdNhaSanXuat(NSX IdNhaSanXuat) {
        this.IdNhaSanXuat = IdNhaSanXuat;
    }

    public MauSac getIdMauSac() {
        return IdMauSac;
    }

    public void setIdMauSac(MauSac IdMauSac) {
        this.IdMauSac = IdMauSac;
    }

    public LoaiSP getIdLoaiSP() {
        return IdLoaiSP;
    }

    public void setIdLoaiSP(LoaiSP IdLoaiSP) {
        this.IdLoaiSP = IdLoaiSP;
    }

    public ChatLieu getIdChatLieu() {
        return IdChatLieu;
    }

    public void setIdChatLieu(ChatLieu IdChatLieu) {
        this.IdChatLieu = IdChatLieu;
    }

    public Size getIdSize() {
        return IdSize;
    }

    public void setIdSize(Size IdSize) {
        this.IdSize = IdSize;
    }

    public int getNamBH() {
        return NamBH;
    }

    public void setNamBH(int NamBH) {
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

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "ChiTietSP{" + "Id=" + Id + ", IdSanPham=" + IdSanPham + ", IdNhaSanXuat=" + IdNhaSanXuat + ", IdMauSac=" + IdMauSac + ", IdLoaiSP=" + IdLoaiSP + ", IdChatLieu=" + IdChatLieu + ", IdSize=" + IdSize + ", NamBH=" + NamBH + ", MoTa=" + MoTa + ", SoLuongTon=" + SoLuongTon + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", TrangThai=" + TrangThai + '}';
    }
    public String getTT(){
        if(TrangThai == 1){
            return "Đang Hoạt Động";
        }else{
            return "Đã Ngưng";
        }
    }
    
    
}
