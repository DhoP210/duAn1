/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.GioHang;
import ViewModels.QLGioHang;

import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IManageGioHangService {
    
    List<QLGioHang> getListAll();
    
    boolean add(GioHang gh);
    
    boolean update(GioHang gh);
    
    boolean delete(GioHang gh);
}
