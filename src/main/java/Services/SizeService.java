/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.SanPham;
import DomainModels.Size;
import Repositories.SanPhamRepository;
import Repositories.SizeRepo;
import Services.impl.SizeImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public class SizeService implements SizeImpl{
     private SizeRepo srp = new SizeRepo();
    private Map<String, Object> mapMa = new HashMap<>();
    List<Size> list = new ArrayList<>();

   public List<Size> getAll() {
        list = new ArrayList<>();
        list = srp.getAll();
        return srp.getAll();
    }


    public String add(Size sp) {
        if (sp.getMa().isEmpty() ||  String.valueOf(sp.getTrangThai()).equals("")) {
            return "Không được bỏ trống";
        
        } else if (mapMa.containsKey(sp.getMa())) {
            return "Trùng mã";
        } else {
            return srp.add(sp);
        }
    }

    public String update(Size sp) {
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
