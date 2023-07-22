/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;


import DomainModels.HoaDonChiTiet;
import Repositories.CTHoaDonRepository;
import Services.impl.IManageCTHoaDon;
import ViewModels.QLCTHoaDon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HoaDonCTService implements IManageCTHoaDon{
    CTHoaDonRepository hdRepo = new CTHoaDonRepository();
    
    @Override
    public List<QLCTHoaDon> getListAll(String id) {
    try {
            List<QLCTHoaDon> list = new ArrayList<>();
            List<HoaDonChiTiet> lists = hdRepo.getList(id);
            for (HoaDonChiTiet a : lists) {
                QLCTHoaDon b = new QLCTHoaDon();
                b.setIdChiTietSP(a.getIdChiTietSP().getId());
                b.setIdHoaDon(a.getIdHoaDon().getId());
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
    public boolean add(HoaDonChiTiet hdct) {
    try {
            return hdRepo.add(hdct);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(HoaDonChiTiet hdct) {
    try {
            return hdRepo.update(hdct);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(String IdHoaDon, String IdChiTietSP) {
    try {
            return hdRepo.delete(IdHoaDon, IdChiTietSP);
        } catch (Exception e) {
            return false;
        }
    }
    
}
