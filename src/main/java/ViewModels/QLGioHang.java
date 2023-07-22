/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class QLGioHang {
    private String Id;
    private String IdKH;
    private String IdNV;
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private String TenNguoiNhan;
    private String DiaChi;
    private String Sdt;
    private String TinhTrang;

    public QLGioHang() {
    }

    public QLGioHang(String Id, String IdKH, String IdNV, String Ma, Date NgayTao, Date NgayThanhToan, String TenNguoiNhan, String DiaChi, String Sdt, String TinhTrang) {
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

    public String getIdKH() {
        return IdKH;
    }

    public void setIdKH(String IdKH) {
        this.IdKH = IdKH;
    }

    public String getIdNV() {
        return IdNV;
    }

    public void setIdNV(String IdNV) {
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

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    @Override
    public String toString() {
        return "QLGioHang{" + "Id=" + Id + ", IdKH=" + IdKH + ", IdNV=" + IdNV + ", Ma=" + Ma + ", NgayTao=" + NgayTao + ", NgayThanhToan=" + NgayThanhToan + ", TenNguoiNhan=" + TenNguoiNhan + ", DiaChi=" + DiaChi + ", Sdt=" + Sdt + ", TinhTrang=" + TinhTrang + '}';
    }
    
    
    
}
