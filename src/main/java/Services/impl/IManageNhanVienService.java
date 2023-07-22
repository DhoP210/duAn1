/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.NhanVien;
import ViewModels.NhanVienViewModel;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IManageNhanVienService {

    List<NhanVienViewModel> getAll();

    boolean add(NhanVien nhanVien);

    boolean update(NhanVien nhanVien);

    boolean delete(NhanVien nhanVien);
}
