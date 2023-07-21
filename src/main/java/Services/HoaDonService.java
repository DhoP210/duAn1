/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import Repositories.HoaDonRepository;
import Services.impl.IManageHoaDonService;
import ViewModels.HoaDonViewModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class HoaDonService implements IManageHoaDonService{
    private HoaDonRepository hdRepo = new HoaDonRepository();

    @Override
    public List<HoaDonViewModel> getListHoaDon(int i, int b) {
         List<Object[]> lhd = hdRepo.getList(i, b);

        List<HoaDonViewModel> hoadon = new ArrayList<>();
        for (Object[] a : lhd) {
            HoaDonViewModel c = new HoaDonViewModel();
            c.setId(a[0].toString());
            c.setMa(a[1].toString());
            c.setTenNV(a[2].toString());
            if (a[3] == null) {
                c.setTenKH("Không Chọn");
            } else {
                c.setTenKH(a[3].toString());
            }
            c.setNgayTao((Date) a[4]);
            if (a[5] == null) {
                c.setThangThai(1);
            } else {
                c.setNgayThanhToan((Date) a[5]);
            }
            if (a[6] == null) {
                c.setPhanTramKM("Không chọn");
            } else {
                c.setPhanTramKM(a[6].toString());
            }
            if (a[7].toString().equals("1")) {
                c.setThangThai(1);
            } else if (a[7].toString().equals("2")) {
                c.setThangThai(2);
            } else {
                c.setThangThai(3);
            }
            hoadon.add(c);
        }
        return hoadon;
    }
    

    @Override
    public int row() {
        try {
            return hdRepo.getListSL();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public List<HoaDonViewModel> loc(int Tranngthai) {
        List<HoaDon> lhd = hdRepo.loc(Tranngthai);
        try {
            List<HoaDonViewModel> hoadon = new ArrayList<>();
            for (HoaDon x : lhd) {
                HoaDonViewModel l = new HoaDonViewModel();
                l.setId(x.getId());
                l.setMa(x.getMa());
//                l.setNgayTao(Date.from(x.getNgayTao()));
                if (x.getNgayThanhToan() == null) {
//                    l.setNgayThanhToan(1);
                } else {
//                    l.setNgayThanhToan(Date.from(x.getNgayThanhToan() + ""));
                }

                if (x.getIdKM() == null) {
                    l.setPhanTramKM("Không chọn");
                } else {
                    l.setPhanTramKM(x.getIdKM().getPhanTramKM() + "");
                }
                if (x.getIdKH() == null) {
                    l.setTenKH("Không chọn");
                } else {
                    l.setTenKH(x.getIdKH().getTen());
                }

                l.setTenNV(x.getIdNV().getTen());
                if (x.getThangThai()== 1) {
//                    l.setThangThai("Chưa Thanh Toán");
                } else if (x.getThangThai()== 2) {
//                    l.setThangThai("Đã Thanh Toán");
                } else {
//                    l.setThangThai("Hóa Đơn Bảo Hành");
                }

                hoadon.add(l);
            }
            return hoadon;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(HoaDon hd) {
        try {
            return hdRepo.addHoadon(hd);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
         try {
            return hdRepo.delete(id);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<HoaDonViewModel> getListHD() {
        try {
            List<HoaDonViewModel> list = new ArrayList<>();
            List<HoaDon> sps = hdRepo.getListHD();

            for (HoaDon sp : sps) {

                HoaDonViewModel x = new HoaDonViewModel();

                x.setId(sp.getId());

                x.setMa(sp.getMa());

                x.setTenNV(sp.getIdNV().getTen());

                x.setTenKH(sp.getIdKH().getTen());

                x.setNgayTao(sp.getNgayTao());

                x.setNgayThanhToan(sp.getNgayThanhToan());

                if (sp.getIdKM() == null) {
                    x.setPhanTramKM("Khong Chon");
                } else {

                    x.setPhanTramKM(sp.getIdKM().getPhanTramKM() + "");
                }

                x.setThangThai(Integer.valueOf(sp.getThangThai()+""));

                list.add(x);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }
    }

    

