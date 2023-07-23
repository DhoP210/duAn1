/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSP;
import DomainModels.ChucVu;
import DomainModels.HoaDon;
import Utilities.HibernateUtil;
import ViewModels.QLChiTietSP;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.TypedQuery;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ChiTietSPRepostority {

    /**
     * @param args the command line arguments
     */
    Session session = HibernateUtil.getFACTORY().openSession();

    public ArrayList<ChiTietSP> getAllData(int trangThai) {
        Query query = session.createQuery("From ChiTietSP where trangThai = " + trangThai);
        ArrayList<ChiTietSP> list = (ArrayList<ChiTietSP>) query.getResultList();
        return list;

    }

    public Boolean add(ChiTietSP chiTietSP) {
        Transaction transaction = null;

        try ( Session se = HibernateUtil.getFACTORY().openSession()) {
            transaction = se.beginTransaction();
            se.save(chiTietSP);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
    
  
    public Boolean delete(String id) {
        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            Transaction t = s.getTransaction();
            t.begin();
            try {
                String hql = "delete ChiTietSP where id = :id";
                Query q = s.createQuery(hql);
                q.setParameter("id", id);
                int result = q.executeUpdate();
                t.commit();
            } catch (Exception e) {
            }
        }
        return true;
    }

    public Boolean update(ChiTietSP chiTietSp) {
        String check = null;
        Transaction transaction = null;
        Session session = HibernateUtil.getFACTORY().openSession();
        try {
            session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(chiTietSp);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

//    public UUID findByIdloaisp(String ten) {
//        UUID uuid;
//        try ( Session session = hibernateconfig.getFACTORY().openSession()) {
//            String statement = "select loaiSP.id from LoaiSP loaiSP where loaiSP.ten = :Ten";
//            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
//            query.setParameter("Ten", ten);
////            uuid = query.getSingleResult();
//        }
////        return uuid;
//        return null;
//    }
//
//    public UUID findByIdmauSac(String ten) {
//        UUID uuid;
//        try ( Session session = hibernateconfig.getFACTORY().openSession()) {
//            String statement = "select mauSac.id from MauSac mauSac where mauSac.ten = :Ten";
//            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
//            query.setParameter("Ten", ten);
////            uuid = query.getSingleResult();
//        }
//        return null;
//    }
//
//    public UUID findByIdsize(String ten) {
//        UUID uuid;
//        try ( Session session = hibernateconfig.getFACTORY().openSession()) {
//            String statement = "select size.id from Size size where size.size = :ten";
//            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
//            query.setParameter("ten", ten);
////            uuid = query.getSingleResult();
//        }
//        return null;
//    }
//
//    public UUID findByIdsanpham(String ten) {
//        UUID uuid;
//        try ( Session session = hibernateconfig.getFACTORY().openSession()) {
//            String statement = "select sanp.id from MauSac sanp where sanp.ten = :ten";
//            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
//            query.setParameter("ten", ten);
////            uuid = query.getSingleResult();
//        }
//        return null;
//    }
    public List<String> listcbbctsp() {
        ArrayList<String> list = new ArrayList<>();
        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            String hql = "Select ctsp.sanPham.ma from ChiTietSP ctsp";
            TypedQuery<String> query = s.createQuery(hql, String.class);
            list = (ArrayList<String>) query.getResultList();
        }
        return list;
    }

    public UUID finByIdctsp(String ma) {

        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            String query = "select ctsp.id from ChiTietSP ctsp where ctsp.sanPham.ma = :ma";
            TypedQuery<UUID> q = s.createQuery(query, UUID.class);
            q.setParameter("ma", ma);

        }
        return null;
    }

    public UUID findByIdhd(String ma) {
        UUID id;
        HoaDon hoaDon = new HoaDon();

        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            String query = "select hd.id from HoaDon hd where hd.ma = :ma";
            TypedQuery<UUID> q = s.createQuery(query, UUID.class);
            q.setParameter("ma", ma);
        }
        return null;

    }
     public boolean anSanPham(String id, int trangThai) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            javax.persistence.Query query = session.createQuery("update ChiTietSP set trangThai =: trangThai where Id =: id");
            query.setParameter("trangThai", trangThai);
            query.setParameter("id",id);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
  
//
//    public List<QLChiTietSP> getListByName(String name) {
//        Session session = HibernateUtil.getFACTORY().openSession();
//        javax.persistence.Query query = session.createQuery(getListByName);
//        query.setParameter("name", name);
//        List<QLChiTietSP> list = query.getResultList();
//        return list;
//    }
//
//    public List<QLChiTietSP> getListByProductType(String type) {
//        Session session = HibernateUtil.getFACTORY().openSession();
//        javax.persistence.Query query = session.createQuery(getListByProductType);
//        query.setParameter("productType", type);
//        List<QLChiTietSP> list = query.getResultList();
//        return list;
//    }
//
//    public List<QLChiTietSP> getListBySize(String size) {
//        Session session = HibernateUtil.getFACTORY().openSession();
//        javax.persistence.Query query = session.createQuery(getListBySize);
//        query.setParameter("size", size);
//        List<QLChiTietSP> list = query.getResultList();
//        return list;
//    }
//
//    public List<QLChiTietSP> getListByColor(String color) {
//        Session session = HibernateUtil.getFACTORY().openSession();
//        javax.persistence.Query query = session.createQuery(getListByColor);
//        query.setParameter("color", color);
//        List<QLChiTietSP> list = query.getResultList();
//        return list;
//    }
//
//    public List<QLChiTietSP> getListBySubstance(String substance) {
//        Session session = HibernateUtil.getFACTORY().openSession();
//        javax.persistence.Query query = session.createQuery(getListBySubstance);
//        query.setParameter("substance", substance);
//        List<QLChiTietSP> list = query.getResultList();
//        return list;
//    }
    public static void main(String[] args) {
        // TODO code application logic here
       
    }

   }


