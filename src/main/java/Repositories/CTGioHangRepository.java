/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSP;
import DomainModels.GioHang;
import DomainModels.GioHangCT;
import Utilities.HibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ASUS
 */
public class CTGioHangRepository {
    
     public List<GioHangCT> getList(String id) {
        
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            Transaction transaction = session.getTransaction();
            Query q = session.createQuery("from GioHangChiTiet A where A.IdGioHang = '" + id + "'");
            List<GioHangCT> list = q.getResultList();
            return list;
        } catch (Exception e) {
            return null;
        }
    }
     
     
      public boolean add(GioHangCT ct) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            GioHangCT i = new GioHangCT();
            
            GioHang gh = session.get(GioHang.class, ct.getIdGioHang().getId());
            
            i.setIdGioHang(gh);
            
            ChiTietSP ctsp = session.get(ChiTietSP.class, ct.getIdChiTietSP().getId());
            
            i.setIdChiTietSP(ctsp);
            i.setSoLuong(ct.getSoLuong());
            i.setDonGia(ct.getDonGia());
     
            session.getTransaction().begin();
            session.save(i);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
      
      public boolean update(GioHangCT ct) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            GioHangCT i = new GioHangCT();
            
            GioHang gh = session.get(GioHang.class, ct.getIdGioHang().getId());
            
            i.setIdGioHang(gh);
            
             ChiTietSP ctsp = session.get(ChiTietSP.class, ct.getIdChiTietSP().getId());
            
             i.setIdChiTietSP(ctsp);
            i.setSoLuong(ct.getSoLuong());
            i.setDonGia(ct.getDonGia());
            
            session.getTransaction().begin();
            session.update(i);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean delete(String IdGioHang ,String IdChiTietSP) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            GioHangCT i = new GioHangCT();
            
            GioHang a = session.get(GioHang.class,IdGioHang);
            
            ChiTietSP b = session.get(ChiTietSP.class, IdChiTietSP);
            
            i.setIdGioHang(a);
            i.setIdChiTietSP(b);
            
            session.getTransaction().begin();
            session.delete(i);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
      
}
