/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.Size;
import Repositories.SizeRepo;
import Services.impl.SizeImpl;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SizeService implements SizeImpl{
    private SizeRepo sizeRepo  = new SizeRepo();
    @Override
    public List<Size> getAll() {
        try {
            return sizeRepo.getAll();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(Size size) {
        try {
              return sizeRepo.add(size);
          } catch (Exception e) {
              return false;
          }
    }

    @Override
    public boolean getMa(String ma) {
        try {
            return sizeRepo.getMa(ma);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(Size size) {
        try {
            return sizeRepo.update(size);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String delete(String ma) {
        try {
            return sizeRepo.delete(ma);
        } catch (Exception e) {
            return null;
        }
    }
}
