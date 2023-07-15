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
public class KhuyenMaiViewModel {
    private String id;
    private String ma;
    private String tenKhuyenMai;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int PhanTramKM;
    private int trangThai;

    public KhuyenMaiViewModel() {
    }

    public KhuyenMaiViewModel(String id, String ma, String tenKhuyenMai, Date ngayBatDau, Date ngayKetThuc, int PhanTramKM, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.tenKhuyenMai = tenKhuyenMai;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.PhanTramKM = PhanTramKM;
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

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getPhanTramKM() {
        return PhanTramKM;
    }

    public void setPhanTramKM(int PhanTramKM) {
        this.PhanTramKM = PhanTramKM;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KhuyenMaiViewModel{" + "id=" + id + ", ma=" + ma + ", tenKhuyenMai=" + tenKhuyenMai + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", PhanTramKM=" + PhanTramKM + ", trangThai=" + trangThai + '}';
    }

    
}
