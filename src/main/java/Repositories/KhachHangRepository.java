/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import Utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author PC
 */
public class KhachHangRepository {
    public List<KhachHang> getListKhachHang() {
        try {
            Session session = HibernateUtil.getFACTORY().openSession(); //Ket noi DB thuc hien hien truy van
            org.hibernate.query.Query q = session.createQuery("FROM KhachHang WHERE TrangThai = 1  order by ma "); //Tao cau truy van lay du lieu tu bang dong go
            List<KhachHang> list = q.getResultList();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public List<KhachHang> getListKHByName(String ten) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            org.hibernate.query.Query q = session.createQuery("FROM KhachHang WHERE TenKhachHang like :ten OR TrangThai = 1  order by ma ");
            q.setParameter("ten", "%" + ten + "%");
            List<KhachHang> list = q.getResultList();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public List<KhachHang> getListKHBysdt(String sdt) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            org.hibernate.query.Query q = session.createQuery("FROM KhachHang WHERE TrangThai = 1 ");
           
            List<KhachHang> list = q.getResultList();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public int getMaxMa() { //Lấy mã lớn nhất + 1 => Tự động tăng
        Session session = HibernateUtil.getFACTORY().openSession();
        String soMaLonNhat = null;
        org.hibernate.query.Query q = session.createQuery(" select A.Ma From KhachHang A Where TrangThai = 1");
        List<String> i = q.getResultList(); //Lay list String 
        if (i.isEmpty()) {
            return 0;
        } else {
            List<Integer> c = new ArrayList<>(); //Convert list String sang List Integer
            for (String a : i) {
                c.add(Integer.parseInt(a));
            }
            System.out.println(c + "\n");

            int max = c.get(0); //Từ list int lấy ra số lớn nhất
            for (int j = 0; j < c.size(); j++) {
                if (c.get(j).compareTo(max) > 0) {
                    max = c.get(j);
                }
            }

            return max;
        }
    }

    public boolean add(KhachHang kh) {
        String getMa = String.valueOf(getMaxMa() + 1);
        try {
            Session ss = HibernateUtil.getFACTORY().openSession();
            KhachHang lsp = new KhachHang();
            lsp.setMa(getMa);
            lsp.setTen(kh.getTen());
            lsp.setGioiTinh(kh.getGioiTinh());
            lsp.setNgaySinh(kh.getNgaySinh());
            lsp.setDiaChi(kh.getDiaChi());
            lsp.setMatKhau(kh.getMatKhau());
            lsp.setEmail(kh.getEmail());
            lsp.setTrangThai(1);

            ss.getTransaction().begin();
            ss.save(lsp);
            ss.getTransaction().commit();
            ss.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean addnhanh(KhachHang kh) {
        String getMa = String.valueOf(getMaxMa() + 1);
        try {
            Session ss = HibernateUtil.getFACTORY().openSession();
            KhachHang lsp = new KhachHang();
            lsp.setMa(getMa);
            lsp.setTen(kh.getTen());
            lsp.setGioiTinh(kh.getGioiTinh());
            lsp.setNgaySinh(kh.getNgaySinh());
            lsp.setDiaChi(kh.getDiaChi());
            lsp.setMatKhau(kh.getMatKhau());
            lsp.setEmail(kh.getEmail());
            lsp.setTrangThai(1);

            ss.getTransaction().begin();
            ss.save(lsp);
            ss.getTransaction().commit();
            ss.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean update(KhachHang kh) {
        try {
            Session ss = HibernateUtil.getFACTORY().openSession();
            KhachHang khss = ss.get(KhachHang.class, kh.getId());
            khss.setTen(kh.getTen());
            khss.setGioiTinh(kh.getGioiTinh());
            khss.setNgaySinh(kh.getNgaySinh());
            khss.setDiaChi(kh.getDiaChi());
            khss.setMatKhau(kh.getMatKhau());
            khss.setEmail(kh.getEmail());
            khss.setTrangThai(1);

            ss.getTransaction().begin();
            ss.save(khss);
            ss.getTransaction().commit();
            ss.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(KhachHang kh) {
        try {
            Session ss = HibernateUtil.getFACTORY().openSession();
            KhachHang khss = ss.get(KhachHang.class, kh.getId());
            khss.setTrangThai(0);
            ss.getTransaction().begin();
            ss.save(khss);
            ss.getTransaction().commit();
            ss.close();
            return true;

        } catch (Exception e) {
            return false;
        }
}
}
