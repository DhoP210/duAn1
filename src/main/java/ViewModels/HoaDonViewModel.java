/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;

/**
 *
 * @author PC
 */
public class HoaDonViewModel {
    private String Id;
    private String tenKH;
    private String tenNV;
    private String phanTramKM;
    private String ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private int ThangThai;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String Id, String tenKH, String tenNV, String phanTramKM, String ma, Date NgayTao, Date NgayThanhToan, int ThangThai) {
        this.Id = Id;
        this.tenKH = tenKH;
        this.tenNV = tenNV;
        this.phanTramKM = phanTramKM;
        this.ma = ma;
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

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getPhanTramKM() {
        return phanTramKM;
    }

    public void setPhanTramKM(String phanTramKM) {
        this.phanTramKM = phanTramKM;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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
        return "HoaDonViewModel{" + "Id=" + Id + ", tenKH=" + tenKH + ", tenNV=" + tenNV + ", phanTramKM=" + phanTramKM + ", ma=" + ma + ", NgayTao=" + NgayTao + ", NgayThanhToan=" + NgayThanhToan + ", ThangThai=" + ThangThai + '}';
    }

}
