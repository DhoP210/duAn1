/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "KhuyenMai")
public class KhuyenMai {
    @Id
    @GenericGenerator(name = "generator",strategy = "guid",parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id")
   private String Id;
    private String Ma;
    private String Ten;
    private Date NgayBatDau;
    private Date NgayKetThuc;
    private int PhanTramKM;
    private int TrangThai;

    public KhuyenMai() {
    }

    public KhuyenMai(String Id, String Ma, String Ten, Date NgayBatDau, Date NgayKetThuc, int TrangThai, int PhanTramKM) {
        this.Id = Id;
        this.Ma = Ma;
        this.Ten = Ten;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.TrangThai = TrangThai;
        this.PhanTramKM = PhanTramKM;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getPhanTramKM() {
        return PhanTramKM;
    }

    public void setPhanTramKM(int PhanTramKM) {
        this.PhanTramKM = PhanTramKM;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" + "Id=" + Id + ", Ma=" + Ma + ", TenKhuyenMai=" + Ten + ", NgayBatDau=" + NgayBatDau + ", NgayKetThuc=" + NgayKetThuc + ", TrangThai=" + TrangThai + ", PhanTramKM=" + PhanTramKM + '}';
    }

    
}
