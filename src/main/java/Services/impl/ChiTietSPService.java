/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;


import DomainModels.ChatLieu;
import DomainModels.ChiTietSP;
import DomainModels.LoaiSP;
import DomainModels.MauSac;
import DomainModels.NSX;
import DomainModels.SanPham;
import DomainModels.Size;
import ViewModels.QLChiTietSP;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface ChiTietSPService {

    ArrayList<ChiTietSP> getAllData();
    
    
     ArrayList<ChiTietSP> getAllDataAn();

    ArrayList<SanPham> getListSP();
    List<ChatLieu> getListCL();
    List<NSX> getListNSX();
    
    ArrayList<LoaiSP> getListLoaiSP();
    
    List<MauSac> getListMauSac();
    
    ArrayList<Size> getListSize();

    String add(ChiTietSP chiTietSP);

    String delete(String id);

    String update(ChiTietSP chiTietSp);

    public ArrayList<String> listcbbctsp();
    
    UUID findbyidctsp(String ma);
    
    UUID findbyidhd(String ma);
     public boolean anSanPham(String id, int trangThai);
}
