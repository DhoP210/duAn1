/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.GioHangCT;
import ViewModels.QLCTGioHang;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IManageCTGioHang {
    List<QLCTGioHang> getListAll(String id);
    
    boolean add(GioHangCT ghct);
    
    boolean update(GioHangCT ghct);
    
    boolean delete(String IdGioHang ,String IdChiTietSP);
}
