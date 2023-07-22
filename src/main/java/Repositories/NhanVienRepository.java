/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import DomainModels.ChucVu;
import Utilities.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author PC
 */
public class NhanVienRepository {

    public List<NhanVien> getAll() {

        try ( Session session = HibernateUtil.getFACTORY().openSession();) {
            Query q = session.createQuery("FROM NhanVien where TrangThai = 1");
            List<NhanVien> nhanViens = q.getResultList();
            return nhanViens;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(NhanVien nv) {

        try {
            Session session = HibernateUtil.getFACTORY().openSession();

            NhanVien v = new NhanVien();

            ChucVu c = session.get(ChucVu.class, nv.getIdChucVu().getId());

            v.setMa(nv.getMa());

            v.setIdChucVu(c);

            v.setTen(nv.getTen());

            v.setGioiTinh(nv.getGioiTinh());

            v.setNgaySinh(nv.getNgaySinh());

            v.setDiaChi(nv.getDiaChi());

            v.setMatKhau(nv.getMatKhau());

            v.setEmail(nv.getEmail());

            v.setSdt(nv.getSdt());

            v.setTrangThai(1);

            session.getTransaction().begin();

            session.save(v);

            session.getTransaction().commit();

            session.close();

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(new NhanVienRepository().getAll());
    }
}
