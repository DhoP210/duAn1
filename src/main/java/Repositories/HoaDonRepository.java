/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import DomainModels.NhanVien;
import Utilities.HibernateUtil;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author PC
 */
public class HoaDonRepository {
    Session session = HibernateUtil.getFACTORY().openSession();
    Transaction transaction = session.getTransaction();
    
     public List<Object[]> getList(int i, int b) {
        try {
            Transaction transaction = session.getTransaction();

            Session session = HibernateUtil.getFACTORY().openSession();
            Query q = session.createNativeQuery("Select A.Id,A.Ma,B.HoTen,C.TenKhachHang"
                    + " ,A.NgayTao , A.NgayThanhToan , D.PhanTramKM ,A.TrangThai from"
                    + " HoaDon A left join NhanVien B on A.IdNhanVien = B.Id left join KhachHang C "
                    + " on A.IdKhachHang = C.Id left join KhuyenMai D on A.IdkhuyenMai = D.Id where A.TrangThai >= 1"
                    + "order by Convert(int,A.Ma) desc "
                    + "OFFSET " + i + " ROWS "
                    + "FETCH NEXT " + b + " ROWS ONLY");
     

            List<Object[]> list = q.getResultList();
            return list;
        } catch (Exception e) {
            return null;
        }

    }

    public int getListSL() {
        int index = -1;
        try {
            Transaction transaction = session.getTransaction();

            Session session = HibernateUtil.getFACTORY().openSession();
            Query q = session.createNativeQuery("Select A.Id,A.Ma,B.HoTen,C.TenKhachHang"
                    + " ,A.NgayTao , A.NgayThanhToan , D.PhanTramKM ,A.TrangThai from"
                    + " HoaDon A left join NhanVien B on A.IdNhanVien = B.Id left join KhachHang C "
                    + " on A.IdKhachHang = C.Id left join KhuyenMai D on A.IdkhuyenMai = D.Id where A.TrangThai >= 1"
                    + "order by Convert(int,A.Ma) desc ");

            List<Object[]> list = q.getResultList();
            index = list.size();
            return index;
        } catch (Exception e) {
            return -1;
        }

    }

    public int getMaxMa() {
        Session session = HibernateUtil.getFACTORY().openSession();
        String soMaLonNhat = null;
        javax.persistence.Query q = session.createQuery(" select A.Ma From HoaDon A  ");
        List<String> i = q.getResultList();
        if (i.isEmpty()) {
            return 0;
        } else {
            List<Integer> c = new ArrayList<>();
            for (String a : i) {
                c.add(Integer.parseInt(a));
            }
            System.out.println(c + "\n");

            int max = c.get(0);
            for (int j = 0; j < c.size(); j++) {
                if (c.get(j).compareTo(max) > 0) {
                    max = c.get(j);
                }
            }

            return max;
        }
    }

    public boolean addHoadon(HoaDon hd) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            Transaction transaction = session.getTransaction();
            java.util.Date date = java.util.Calendar.getInstance().getTime();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            String now = format.format(date);

            HoaDon i = new HoaDon();
            i.setMa(String.valueOf(getMaxMa() + 1)); // mã lớn nhất + thêm 1         
            i.setNgayTao(Date.valueOf(now)); // lấy thời gian ở trên gán vô 
            NhanVien nv = session.get(NhanVien.class, hd.getIdNV().getId());
            i.setIdNV(nv);
            i.setThangThai(0); // 0 là chưa thanh toán - 1 là đã hoàn thành 
            i.setThangThai(1);// trang thai outo la 1 , 0 là đã xóa 

            transaction.begin();
            session.save(i);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            transaction.rollback();
            return false;
        }
    }

    public boolean delete(String id) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            HoaDon hds = session.get(HoaDon.class, id);
            hds.setThangThai(0);
            session.getTransaction().begin();
            session.save(hds);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<HoaDon> loc(int Trangthai) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            Query q = session.createQuery("FROM HoaDon Where ThangThai = :a ");
            q.setParameter("a", Trangthai);
            List<HoaDon> list = q.getResultList();
            return list;
        } catch (Exception e) {
            return null;
        }
    }
    
    
    
     public List<HoaDon> getListHD() {
        
        
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            Query q = session.createQuery("FROM HoaDon where ThangThai >= 1 order by Convert(int,Ma) desc");
            List<HoaDon> list = q.getResultList();
            return list;
            
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        HoaDonRepository hd = new HoaDonRepository();
//        int i = hd.getListSL(0, 5);
//        System.out.println(i);

//        List<HoaDon> list = hd.getList(2,5);
//        for (HoaDon hoaDon : list) {
//            System.out.println(hoaDon.toString());
//        }
     //   List<Object[]> list = hd.getList(2, 5);
        
         for (Object[] arg : hd.getList(0, 5)) {
             System.out.println(arg.toString());
        }

        System.out.println(hd.getListHD());
        

    }
}
