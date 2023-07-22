/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.ChucVu;
import java.util.Date;

/**
 *
 * @author PC
 */
public class NhanVienViewModel {

    private String id;
    private String ma;
    private String ten;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String matKhau;
    private String email;
    private String tenCV;
    private String sdt;
    private String trangThai;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(String id, String ma, String ten, String gioiTinh, Date ngaySinh, String diaChi, String matKhau, String email, String tenCV, String sdt, String trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
        this.email = email;
        this.tenCV = tenCV;
        this.sdt = sdt;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVienViewModel{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", matKhau=" + matKhau + ", email=" + email + ", tenCV=" + tenCV + ", sdt=" + sdt + ", trangThai=" + trangThai + '}';
    }

}
