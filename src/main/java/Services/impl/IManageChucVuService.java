/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.ChucVu;
import ViewModels.QLChucVu;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IManageChucVuService {
    
    List<QLChucVu> getAll();

//    List<QLChucVu> getListSPByName(String ten);

    boolean add(ChucVu c);

    boolean update(ChucVu c);

    boolean delete(ChucVu c);
}
