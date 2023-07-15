/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.MauSac;
import Repositories.MauSacRepo;
import Services.impl.MauSacImpl;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class MauSacService implements MauSacImpl{
   private MauSacRepo msRepo = new MauSacRepo();
    @Override
    public List<MauSac> getAll() {
         try {
            return msRepo.getAll();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(MauSac ms) {
         try {
            return msRepo.add(ms);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(MauSac ms) {
        try {
            return msRepo.update(ms);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(MauSac ms) {
        try {
            return msRepo.delete(ms);
        } catch (Exception e) {
            return false;
        }
    }
    
}
