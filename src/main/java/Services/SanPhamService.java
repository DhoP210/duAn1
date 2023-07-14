/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;


import DomainModels.SanPham;
import java.util.List;

/**
 *
 * @author PC
 */
public interface SanPhamService {

    public List<SanPham> getAll();

    String add(SanPham sp);

    String update(SanPham sp);

    String delete(String ma);

    public List<String> listcbbsize();
}
