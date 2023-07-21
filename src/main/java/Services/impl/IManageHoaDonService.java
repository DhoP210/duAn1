/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.HoaDon;
import ViewModels.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IManageHoaDonService {
    List<HoaDonViewModel> getListHoaDon(int i, int b);

    int row();

    List<HoaDonViewModel> loc(int Tranngthai);

    boolean add(HoaDon hd);

    boolean delete(String id);
    
     List<HoaDonViewModel> getListHD();
}
