/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.KhachHang;
import ViewModels.KhachHangViewModel;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IManageKhachHangService {
     List<KhachHangViewModel> getListKhachHang();
    List<KhachHangViewModel> getListKhachHangByName(String ten);
    List<KhachHangViewModel> getListKhachHangBysdt(String sdt);
    boolean add(KhachHang kh);
    boolean update(KhachHang kh);
    boolean delete(KhachHang kh);
}
