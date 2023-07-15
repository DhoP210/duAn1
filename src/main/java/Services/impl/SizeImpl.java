/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.SanPham;
import DomainModels.Size;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface SizeImpl {
        public List<Size> getAll();

    String add(Size sp);

    String update(Size sp);

    String delete(String ma);

    public List<String> listcbbsize();
}
