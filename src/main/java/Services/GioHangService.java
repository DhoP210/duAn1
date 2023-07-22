/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.GioHang;
import Repositories.GioHangRepository;
import Services.impl.IManageGioHangService;
import ViewModels.QLGioHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class GioHangService implements IManageGioHangService{
    GioHangRepository ghRepo = new GioHangRepository();
    
    @Override
    public List<QLGioHang> getListAll() {
    List<GioHang> gh = ghRepo.getListGH();
        try {
            List<QLGioHang> gioHangVM = new ArrayList<>();
            for (GioHang x : gh) {
                QLGioHang i = new QLGioHang();
                i.setId(x.getId());
                i.setIdKH(x.getIdKH().getTen());
                i.setIdNV(x.getIdNV().getTen());
                i.setMa(x.getMa());
                i.setNgayTao(x.getNgayTao());
                i.setNgayThanhToan(x.getNgayThanhToan());
                i.setTenNguoiNhan(x.getTenNguoiNhan());
                i.setDiaChi(x.getDiaChi());
                i.setSdt(x.getSdt());
                i.setTinhTrang(String.valueOf(x.getTinhTrang()));
                gioHangVM.add(i);
            }
            return gioHangVM;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(GioHang gh) {
    try {
            return ghRepo.add(gh);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(GioHang gh) {
    try {
            return ghRepo.update(gh);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(GioHang gh) {
    try {
            return ghRepo.delete(gh);
        } catch (Exception e) {
            return false;
        }
    }
    
}
