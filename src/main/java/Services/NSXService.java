/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NSX;
import Repositories.NSXRepo;
import Services.impl.NSXImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NSXService implements NSXImpl{
    
    private NSXRepo nsxRepo = new NSXRepo();
    @Override
    public List<NSX> getAll() {
         List<NSX> nsx = nsxRepo.getAll();
        try {
            List<NSX> nsxx = new ArrayList<>();
            for (NSX list : nsxx) {

                NSX v = new NSX();
                
                v.setId(list.getId());
                
                v.setMa(list.getMa());
                
                v.setTen(list.getTen());
                
                v.setTrangThai(Integer.valueOf(list.getTrangThai()));
                nsxx.add(v);

            }

            return nsxx;
            
        } catch (Exception e) {
            return null;
        }
          }

    @Override
    public Boolean add(NSX nsx) {
        return nsxRepo.add(nsx);
    }
    
    @Override
    public Boolean update(NSX nsx) {
        return nsxRepo.update(nsx);
    }

    @Override
    public Boolean delete(String ma) {
        return nsxRepo.delete(ma);
    }
    
}
