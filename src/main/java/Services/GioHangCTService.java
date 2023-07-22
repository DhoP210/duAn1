/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.GioHang;
import DomainModels.GioHangCT;
import Repositories.CTGioHangRepository;
import Services.impl.IManageCTGioHang;
import ViewModels.QLCTGioHang;
import ViewModels.QLGioHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class GioHangCTService implements IManageCTGioHang{
    CTGioHangRepository ghRepo = new CTGioHangRepository();
    
    @Override
    public List<QLCTGioHang> getListAll(String id) { 
        try {
            List<QLCTGioHang> list = new ArrayList<>();
            List<GioHangCT> lists = ghRepo.getList(id);
            for (GioHangCT a : lists) {
                QLCTGioHang b = new QLCTGioHang();
                b.setIdChiTietSP(a.getIdChiTietSP().getId());
                b.setIdGioHang(a.getIdGioHang().getId());
                b.setTen(a.getIdChiTietSP().getIdSanPham().getTen());
                b.setSoLuong(a.getSoLuong());
                b.setDonGia(a.getDonGia());
                
                list.add(b);
            }
            
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(GioHangCT ghct) {
    try {
            return ghRepo.add(ghct);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(GioHangCT ghct) {
    try {
            return ghRepo.update(ghct);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(String IdGioHang ,String IdChiTietSP) {
    try {
            return ghRepo.delete(IdGioHang, IdChiTietSP);
        } catch (Exception e) {
            return false;
        }
    }
    
}
