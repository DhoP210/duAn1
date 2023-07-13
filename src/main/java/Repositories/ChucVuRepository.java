/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import Utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author ASUS
 */
public class ChucVuRepository {
    
    public List<ChucVu> getAll() {

        try {

            Session se = HibernateUtil.getFACTORY().openSession();
            
            Query q = se.createQuery("FROM ChucVu WHERE TrangThai = 1 ");
            
            List<ChucVu> list = q.getResultList();
            
            return list;
            

        } catch (Exception e) {
            return null;
        }
    }
    
    
     public boolean add(ChucVu cv) {

        try {
            
            
            Session se = HibernateUtil.getFACTORY().openSession();

            ChucVu cvu = new ChucVu();
            
            cvu.setMa(cv.getMa());
            
            cvu.setTen(cv.getTen());
            
            cvu.setTrangThai(1);

            se.getTransaction().begin();
            se.save(cvu);
            se.getTransaction().commit();
            se.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
     public boolean update(ChucVu c) {

        
        try {
            Session se = HibernateUtil.getFACTORY().openSession();
            
            ChucVu cv = se.get(ChucVu.class, c.getId());
            
            cv.setMa(c.getMa());
            cv.setTen(c.getTen());
            
            cv.setTrangThai(1);

            se.getTransaction().begin();
            se.save(cv);
            se.getTransaction().commit();
            se.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
     public boolean delete(ChucVu c) {

        try {
            Session se = HibernateUtil.getFACTORY().openSession();
            
            ChucVu cv = se.get(ChucVu.class, c.getId());
            
            cv.setTrangThai(0);

            se.getTransaction().begin();
            se.save(cv);
            se.getTransaction().commit();
            se.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
