/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.LoaiSP;
import Repositories.LoaiSPRepo;
import Services.impl.LoaiSPImpl;
import ViewModels.QLLoaiSP;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class LoaiSPService implements LoaiSPImpl{
    private LoaiSPRepo lspRepo = new LoaiSPRepo();
    @Override
    public List<QLLoaiSP> getAll() {
         List<LoaiSP> lsp = lspRepo.getAll();
        try {
            List<QLLoaiSP> loaiSP = new ArrayList<>();
            for (QLLoaiSP qllsp  : loaiSP) {

                QLLoaiSP v = new QLLoaiSP();
                
                v.setId(qllsp.getId());
                
                v.setMa(qllsp.getMa());
                
                v.setTen(qllsp.getTen());
                
                v.setTrangThai(String.valueOf(qllsp.getTrangThai()));
                loaiSP.add(v);

            }

            return loaiSP;
            
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(LoaiSP loaiSP) {
        try {
            return lspRepo.add(loaiSP);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(LoaiSP loaiSP) {
         try {
            return lspRepo.update(loaiSP);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(LoaiSP loaiSP) {
          try {
            return lspRepo.delete(loaiSP);
        } catch (Exception e) {
            return false;
        }
    }
    
}
