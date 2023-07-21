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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "HoaDon")
public class HoaDon {
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    
    private String Id;
    
    @ManyToOne
    @JoinColumn(name = "IdKH")
    private KhachHang IdKH;
    
    @ManyToOne
    @JoinColumn(name = "IdNV")
    private NhanVien IdNV;
    
    @ManyToOne
    @JoinColumn(name = "IdKM")
    private KhuyenMai IdKM;
    
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private int ThangThai;

    public HoaDon() {
    }

    public HoaDon(String Id, KhachHang IdKH, NhanVien IdNV, KhuyenMai IdKM, String Ma, Date NgayTao, Date NgayThanhToan, int ThangThai) {
        this.Id = Id;
        this.IdKH = IdKH;
        this.IdNV = IdNV;
        this.IdKM = IdKM;
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.ThangThai = ThangThai;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public KhachHang getIdKH() {
        return IdKH;
    }

    public void setIdKH(KhachHang IdKH) {
        this.IdKH = IdKH;
    }

    public NhanVien getIdNV() {
        return IdNV;
    }

    public void setIdNV(NhanVien IdNV) {
        this.IdNV = IdNV;
    }

    public KhuyenMai getIdKM() {
        return IdKM;
    }

    public void setIdKM(KhuyenMai IdKM) {
        this.IdKM = IdKM;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public int getThangThai() {
        return ThangThai;
    }

    public void setThangThai(int ThangThai) {
        this.ThangThai = ThangThai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "Id=" + Id + ", IdKH=" + IdKH + ", IdNV=" + IdNV + ", IdKM=" + IdKM + ", Ma=" + Ma + ", NgayTao=" + NgayTao + ", NgayThanhToan=" + NgayThanhToan + ", ThangThai=" + ThangThai + '}';
    }

    
    
    
}
