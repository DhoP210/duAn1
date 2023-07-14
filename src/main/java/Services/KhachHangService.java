/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.KhachHang;
import Repositories.KhachHangRepository;
import Services.impl.IManageKhachHangService;
import ViewModels.KhachHangViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class KhachHangService implements IManageKhachHangService{
     KhachHangRepository khrp = new KhachHangRepository();
    @Override
    public List<KhachHangViewModel> getListKhachHang() {
        List<KhachHang> lsp = khrp.getListKhachHang();
        try {
            List<KhachHangViewModel> khachHang = new ArrayList<>();
            for (KhachHangViewModel khachHangViewModel : khachHang) {
                KhachHangViewModel v = new KhachHangViewModel();
                v.setId(khachHangViewModel.getId());
                v.setMa(khachHangViewModel.getMa());
                v.setTen(khachHangViewModel.getTen());
                v.setGioiTinh(khachHangViewModel.getGioiTinh());
                v.setNgaySinh(khachHangViewModel.getNgaySinh());
                v.setDiaChi(khachHangViewModel.getDiaChi());
                v.setMatKhau(khachHangViewModel.getMatKhau());
                v.setEmail(khachHangViewModel.getEmail());
                v.setTrangthai(Integer.valueOf(khachHangViewModel.getTrangthai()));
                khachHang.add(v);
                
            }
            return  khachHang;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<KhachHangViewModel> getListKhachHangByName(String ten) {
     List<KhachHang> lsp = khrp.getListKHByName(ten);
        try {
            List<KhachHangViewModel> khachHang = new ArrayList<>();
            for (KhachHangViewModel khachHangViewModel : khachHang) {
                KhachHangViewModel v = new KhachHangViewModel();
                v.setId(khachHangViewModel.getId());
                v.setMa(khachHangViewModel.getMa());
                v.setTen(khachHangViewModel.getTen());
                v.setGioiTinh(khachHangViewModel.getGioiTinh());
                v.setNgaySinh(khachHangViewModel.getNgaySinh());
                v.setDiaChi(khachHangViewModel.getDiaChi());
                v.setMatKhau(khachHangViewModel.getMatKhau());
                v.setEmail(khachHangViewModel.getEmail());
                v.setTrangthai(Integer.valueOf(khachHangViewModel.getTrangthai()));
                khachHang.add(v);
                
            }
            return  khachHang;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<KhachHangViewModel> getListKhachHangBysdt(String sdt) {
    List<KhachHang> lsp = khrp.getListKHBysdt(sdt);
        try {
            List<KhachHangViewModel> khachHang = new ArrayList<>();
            for (KhachHangViewModel khachHangViewModel : khachHang) {
                KhachHangViewModel v = new KhachHangViewModel();
                v.setId(khachHangViewModel.getId());
                v.setMa(khachHangViewModel.getMa());
                v.setTen(khachHangViewModel.getTen());
                v.setGioiTinh(khachHangViewModel.getGioiTinh());
                v.setNgaySinh(khachHangViewModel.getNgaySinh());
                v.setDiaChi(khachHangViewModel.getDiaChi());
                v.setMatKhau(khachHangViewModel.getMatKhau());
                v.setEmail(khachHangViewModel.getEmail());
                v.setTrangthai(Integer.valueOf(khachHangViewModel.getTrangthai()));
                khachHang.add(v);
                
            }
            return  khachHang;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(KhachHang kh) {
    try {
            return khrp.add(kh);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(KhachHang kh) {
    try {
            return khrp.update(kh);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(KhachHang kh) {
    try {
            return khrp.delete(kh);
        } catch (Exception e) {
            return false;
        }
    }
    
}
