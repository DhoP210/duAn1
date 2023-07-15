/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.LoaiSP;
import ViewModels.QLLoaiSP;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface LoaiSPImpl {
    List<QLLoaiSP> getAll();

    boolean add(LoaiSP loaiSP);

    boolean update(LoaiSP loaiSP);

    boolean delete(LoaiSP loaiSP);
}
