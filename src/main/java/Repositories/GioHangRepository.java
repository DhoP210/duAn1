/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.GioHang;
import DomainModels.NhanVien;
import DomainModels.KhachHang;
import Utilities.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author ASUS
 */
public class GioHangRepository {
    
    public List<GioHang> getListGH() {
        
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            Query q = session.createQuery("FROM GioHang where TinhTrang >= 1 order by Convert(int,Ma) desc");
            List<GioHang> list = q.getResultList();
            return list;
            
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean add(GioHang gh) {

        try {
            
            
            Session se = HibernateUtil.getFACTORY().openSession();

            GioHang ghs = new GioHang();
            
            KhachHang kh = se.get(KhachHang.class, gh.getIdKH().getId());
            NhanVien nv = se.get(NhanVien.class, gh.getIdNV().getId());
           
            ghs.setMa(gh.getMa());
            ghs.setNgayTao(gh.getNgayTao());
            ghs.setNgayThanhToan(gh.getNgayThanhToan());
            ghs.setTenNguoiNhan(gh.getTenNguoiNhan());
            ghs.setDiaChi(gh.getDiaChi());
            ghs.setSdt(gh.getSdt());
            ghs.setTinhTrang(1);

            se.getTransaction().begin();
            se.save(ghs);
            se.getTransaction().commit();
            se.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean update(GioHang gh) {

        try {
            Session session = HibernateUtil.getFACTORY().openSession();

            GioHang gioHang = session.get(GioHang.class, gh.getId());
            
            KhachHang kh = session.get(KhachHang.class, gh.getIdKH().getId());
            NhanVien nv = session.get(NhanVien.class, gh.getIdNV().getId());
            
            gioHang.setMa(gh.getMa());
            gioHang.setNgayTao(gh.getNgayTao());
            gioHang.setNgayThanhToan(gh.getNgayThanhToan());
            gioHang.setTenNguoiNhan(gh.getTenNguoiNhan());
            gioHang.setDiaChi(gh.getDiaChi());
            gioHang.setSdt(gh.getSdt());
            gioHang.setTinhTrang(1);
            
            
            session.getTransaction().begin();
            session.save(gioHang);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean delete(GioHang gh) {

        try {
            Session session = HibernateUtil.getFACTORY().openSession();

            GioHang khuyenMai = session.get(GioHang.class, gh.getId());
            
            khuyenMai.setTinhTrang(0);

            session.getTransaction().begin();
            session.save(khuyenMai);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
