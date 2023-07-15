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
   private LoaiSPRepo loaiSPRepostority = new LoaiSPRepo();
    List<LoaiSP> listLoaiSP = new ArrayList<>();

    @Override
    public List<LoaiSP> loadData() {
        return loaiSPRepostority.getAllData();
    }

    @Override
    public String ADD(LoaiSP loaiSP) {
        boolean addLoaiSP = loaiSPRepostority.add(loaiSP);
        if (addLoaiSP) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(LoaiSP loaiSP) {
        boolean updateLoaiSP = loaiSPRepostority.Update(loaiSP);
        if (updateLoaiSP) {
            return "Cập nhật thành công";
        }
        return "Cập nhật thất bại";
    }

    @Override
    public String Delete(String ma) {
        boolean xoaLoaiSP = loaiSPRepostority.delete(ma);
        if (xoaLoaiSP) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

    @Override
    public List<String> listcbbloaisp() {
        return loaiSPRepostority.listcbbloaisp();
    }
}
