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
 * @author ASUS
 */
@Entity
@Table(name = "GioHang")
public class GioHang {
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
    
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private String TenNguoiNhan;
    private String DiaChi;
    private String Sdt;
    private int TinhTrang;

    public GioHang() {
    }

    public GioHang(String Id, KhachHang IdKH, NhanVien IdNV, String Ma, Date NgayTao, Date NgayThanhToan, String TenNguoiNhan, String DiaChi, String Sdt, int TinhTrang) {
        this.Id = Id;
        this.IdKH = IdKH;
        this.IdNV = IdNV;
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.TenNguoiNhan = TenNguoiNhan;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.TinhTrang = TinhTrang;
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

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String TenNguoiNhan) {
        this.TenNguoiNhan = TenNguoiNhan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    @Override
    public String toString() {
        return "GioHang{" + "Id=" + Id + ", IdKH=" + IdKH + ", IdNV=" + IdNV + ", Ma=" + Ma + ", NgayTao=" + NgayTao + ", NgayThanhToan=" + NgayThanhToan + ", TenNguoiNhan=" + TenNguoiNhan + ", DiaChi=" + DiaChi + ", Sdt=" + Sdt + ", TinhTrang=" + TinhTrang + '}';
    }
    
    
    
}
