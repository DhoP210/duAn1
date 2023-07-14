/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.SanPham;
import Repositories.SanPhamRepository;
import Services.SanPhamService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author PC
 */
public class SanPhamImpl implements SanPhamService {

    private SanPhamRepository srp = new SanPhamRepository();
    private Map<String, Object> mapMa = new HashMap<>();
    List<SanPham> list = new ArrayList<>();

   public List<SanPham> getAll() {
        list = new ArrayList<>();
        list = srp.getAll();
        return srp.getAll();
    }


    public String add(SanPham sp) {
        if (sp.getMa().isEmpty() ||  String.valueOf(sp.getTrangThai()).equals("")) {
            return "Không được bỏ trống";
        
        } else if (mapMa.containsKey(sp.getMa())) {
            return "Trùng mã";
        } else {
            return srp.add(sp);
        }
    }

    public String update(SanPham sp) {
        if (sp.getMa().isEmpty() || String.valueOf(sp.getTrangThai()).equals("")) {
            return "Không được bỏ trống";
       
        
        } else {
            return srp.update(sp);
        }
    }

    public String delete(String ma) {
        return srp.delete(ma);
    }

    @Override
    public List<String> listcbbsize() {
        return srp.listcbbsize();
    }
   
    
  
}
