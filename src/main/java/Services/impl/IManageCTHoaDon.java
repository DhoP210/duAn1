/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.HoaDonChiTiet;
import ViewModels.QLCTHoaDon;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IManageCTHoaDon {
     List<QLCTHoaDon> getListAll(String id);
    
    boolean add(HoaDonChiTiet hdct);
    
    boolean update(HoaDonChiTiet hdct);
    
    boolean delete(String IdHoaDon ,String IdChiTietSP);
    
}
