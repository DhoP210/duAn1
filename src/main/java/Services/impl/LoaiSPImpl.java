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
       public List<LoaiSP> loadData();

    public String ADD(LoaiSP loaiSP);

    public String update(LoaiSP loaiSP);

    public String Delete(String ma);
    
    public List<String> listcbbloaisp();
    
}
