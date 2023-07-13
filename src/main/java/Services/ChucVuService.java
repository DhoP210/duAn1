/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Repositories.ChucVuRepository;
import DomainModels.ChucVu;
import Services.impl.IManageChucVuService;
import ViewModels.QLChucVu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ChucVuService implements IManageChucVuService{

    private ChucVuRepository rp = new ChucVuRepository();
            
    @Override
    public List<QLChucVu> getAll() {
     List<ChucVu> cv = rp.getAll();
        try {
            List<QLChucVu> chucVu = new ArrayList<>();
            for (ChucVu c : cv) {

                QLChucVu v = new QLChucVu();
                
                v.setId(c.getId());
                
                v.setMa(c.getMa());
                
                v.setTen(c.getTen());
                
                v.setTrangThai(String.valueOf(c.getTrangThai()));
                chucVu.add(v);

            }

            return chucVu;
            
        } catch (Exception e) {
            return null;
        }
    }
    
//     @Override
//    public List<QLChucVu> getListSPByName(String ten) {
//    
//    }

    @Override
    public boolean add(ChucVu c) {
     try {
            return rp.add(c);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(ChucVu c) {
     try {
            return rp.update(c);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(ChucVu c) {
    try {
            return rp.delete(c);
        } catch (Exception e) {
            return false;
        }
    }

   
    
}
