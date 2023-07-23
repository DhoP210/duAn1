/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;


import DomainModels.ChatLieu;
import DomainModels.ChiTietSP;
import DomainModels.LoaiSP;
import DomainModels.MauSac;
import DomainModels.NSX;
import DomainModels.SanPham;
import DomainModels.Size;
import Repositories.ChatLieuRepo;
import Repositories.ChiTietSPRepostority;
import Repositories.LoaiSPRepo;
import Repositories.MauSacRepo;
import Repositories.NSXRepo;
import Repositories.SanPhamRepository;
import Repositories.SizeRepo;
import Services.impl.ChiTietSPService;
import ViewModels.QLChiTietSP;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ChiTietSPServiceImpl implements ChiTietSPService {

    private ChiTietSPRepostority chiTietSPRepostority = new ChiTietSPRepostority();
    private SanPhamRepository sanPhamRepo = new SanPhamRepository();
    private LoaiSPRepo loaiSPRepo = new LoaiSPRepo();
    private MauSacRepo mauSacRepo = new MauSacRepo();
    private SizeRepo sizeRepo = new SizeRepo();
    private ChatLieuRepo chatLieuRepo = new ChatLieuRepo();
    private NSXRepo nsxRepo = new NSXRepo();

    @Override
    public ArrayList<ChiTietSP> getAllData() {
        return chiTietSPRepostority.getAllData(1);
    }
    @Override
    public ArrayList<ChiTietSP> getAllDataAn() {
 return chiTietSPRepostority.getAllData(0);  
    }

    @Override
    public String add(ChiTietSP chiTietSP) {
        if (chiTietSPRepostority.add(chiTietSP)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String delete(String id) {
        if (chiTietSPRepostority.delete(id)) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public String update(ChiTietSP chiTietSp) {
        if (chiTietSPRepostority.update(chiTietSp)) {
            return "Cập nhật thành công";
        } else {
            return "Cập nhật thất bại";
        }
    }

//    @Override
//    public UUID findByIdmauSac(String ten) {
//        return chiTietSPRepostority.findByIdmauSac(ten);
//    }
//
//    @Override
//    public UUID findByIdsize(String ten) {
//        return chiTietSPRepostority.findByIdsize(ten);
//    }
//
//    @Override
//    public UUID findByIdsanpham(String ten) {
//        return chiTietSPRepostority.findByIdsanpham(ten);
//    }
//
//    @Override
//    public UUID findByIdloaisp(String ten) {
//        return chiTietSPRepostority.findByIdloaisp(ten);
//    }

    @Override
    public ArrayList<String> listcbbctsp() {
        return (ArrayList<String>) chiTietSPRepostority.listcbbctsp();
    }

    @Override
    public ArrayList<SanPham> getListSP() {
        return sanPhamRepo.getAll();
    }

    @Override
    public ArrayList<LoaiSP> getListLoaiSP() {
        return loaiSPRepo.getAllData();
    }

    @Override
    public List<MauSac> getListMauSac() {
        return mauSacRepo.getAll();
    }

    @Override
    public ArrayList<Size> getListSize() {
        return sizeRepo.getAll();
    }

    @Override
    public UUID findbyidctsp(String ma) {
        return chiTietSPRepostority.finByIdctsp(ma);
    }

    @Override
    public UUID findbyidhd(String ma) {
        return chiTietSPRepostority.findByIdhd(ma);
    }

    @Override
    public List<ChatLieu> getListCL() {
        return chatLieuRepo.getAll();
    }

    @Override
    public List<NSX> getListNSX() {
        return nsxRepo.getAll();
    }

    @Override
    public boolean anSanPham(String id, int trangThai) {
         return chiTietSPRepostority.anSanPham(id, trangThai);
    }

    

   

}
