/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSP;
import DomainModels.HoaDon;
import DomainModels.HoaDonChiTiet;
import Utilities.HibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ASUS
 */
public class CTHoaDonRepository {
    
     public List<HoaDonChiTiet> getList(String id) {
        
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            Transaction transaction = session.getTransaction();
            Query q = session.createQuery("from HoaDonChiTiet A where A.IdHoaDon = '" + id + "'");
            List<HoaDonChiTiet> list = q.getResultList();
            return list;
        } catch (Exception e) {
            return null;
        }
    }
     
     
      public boolean add(HoaDonChiTiet ct) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            HoaDonChiTiet i = new HoaDonChiTiet();
            
            HoaDon hd = session.get(HoaDon.class, ct.getIdHoaDon().getId());
            
            i.setIdHoaDon(hd);
            
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
      
      public boolean update(HoaDonChiTiet ct) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            HoaDonChiTiet i = new HoaDonChiTiet();
            
            HoaDon hd = session.get(HoaDon.class, ct.getIdHoaDon().getId());
            
            i.setIdHoaDon(hd);
            
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
    
    public boolean delete(String IdHoaDon ,String IdChiTietSP) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            HoaDonChiTiet i = new HoaDonChiTiet();
            
            HoaDon a = session.get(HoaDon.class,IdHoaDon);
            
            ChiTietSP b = session.get(ChiTietSP.class, IdChiTietSP);
            
            i.setIdHoaDon(a);
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
