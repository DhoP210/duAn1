/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
import Repositories.NhanVienRepository;
import Services.impl.IManageNhanVienService;
import ViewModels.NhanVienViewModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class NhanVienService implements IManageNhanVienService {

    private NhanVienRepository nhanVienRepo = new NhanVienRepository();

    @Override
    public List<NhanVienViewModel> getAll() {
        List<NhanVien> nhanViens = this.nhanVienRepo.getAll();
        try {
            List<NhanVienViewModel> viewModels = new ArrayList<>();
            for (NhanVien viewModel : nhanViens) {
                NhanVienViewModel model = new NhanVienViewModel();
                model.setId(viewModel.getId());
                model.setMa(viewModel.getMa());
                model.setTen(viewModel.getTen());
                model.setGioiTinh(viewModel.getGioiTinh());
                model.setNgaySinh(viewModel.getNgaySinh());
                model.setDiaChi(viewModel.getDiaChi());
                model.setMatKhau(viewModel.getMatKhau());
                model.setEmail(viewModel.getEmail());
                model.setTenCV(viewModel.getIdChucVu().getTen());
                model.setTrangThai(String.valueOf(viewModel.getTrangThai()));
                model.setSdt(viewModel.getSdt());

                viewModels.add(model);
            }

            return viewModels;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public boolean add(NhanVien nhanVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(NhanVien nhanVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(NhanVien nhanVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
