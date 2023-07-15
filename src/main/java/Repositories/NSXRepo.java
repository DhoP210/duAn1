/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.MauSac;
import DomainModels.NSX;
import Utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ADMIN
 */
public class NSXRepo {
     public List<NSX> getAll(){
         try {

            Session se = HibernateUtil.getFACTORY().openSession();
            
            Query q = se.createQuery("FROM NSX  ");
            
            List<NSX> list = q.getResultList();
            
            return list;
            

        } catch (Exception e) {
            return null;
        }
    }
    
    public NSX getOne(Long id) {
        NSX nsx = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            // truy van HQL
            Query query = session.createQuery("FROM NSX WHERE id =:id1 ",
                    NSX.class);
            query.setParameter("id1", id);
            nsx = (NSX) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nsx;
    }
    
    public Boolean add(NSX nsx) {
      try {
            
            
            Session se = HibernateUtil.getFACTORY().openSession();

            NSX nsxx = new NSX();
            
            nsxx.setMa(nsx.getMa());
            
            nsxx.setTen(nsx.getTen());
            
            nsxx.setTrangThai(1);

            se.getTransaction().begin();
            se.save(nsxx);
            se.getTransaction().commit();
            se.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
    
     // Update
    public Boolean update(NSX nsx) {
            
        try {
            Session se = HibernateUtil.getFACTORY().openSession();
            
            NSX nsxx = se.get(NSX.class, nsx.getId());
            
            nsxx.setMa(nsx.getMa());
            nsxx.setTen(nsx.getTen());
            
            nsxx.setTrangThai(1);

            se.getTransaction().begin();
            se.saveOrUpdate(nsxx);
            se.getTransaction().commit();
            se.close();
            return true;

        } catch (Exception e) {
            return false;
        }    }
    
    
     public Boolean delete(String ma ) {
        Transaction transaction = null;
        NSX nsx = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            // Delete
            nsx = session.get(NSX.class, ma);
            session.delete(nsx);
            // Commit
            transaction.commit();
            return true;
        } catch (Exception e) {
            if(transaction !=null){
                transaction.rollback();
            }
        }
        return false;
    }
}
