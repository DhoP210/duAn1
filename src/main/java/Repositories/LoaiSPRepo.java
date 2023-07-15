/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.LoaiSP;
import Utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ADMIN
 */
public class LoaiSPRepo {
    public List<LoaiSP> getAll(){
         try {
            Session se = HibernateUtil.getFACTORY().openSession(); 
            Query q = se.createQuery("FROM LoaiSP WHERE TrangThai = 1 ");          
            List<LoaiSP> list = q.getResultList();         
            return list;
        } catch (Exception e) {
            return null;
        }
    }
    
    public LoaiSP getOne(Long id) {
        Transaction transaction = null;
        LoaiSP loaiSP = null;
         try (Session session = HibernateUtil.getFACTORY().openSession() ){
            transaction = session.beginTransaction();
            loaiSP = session.get(LoaiSP.class, id);
            transaction.commit();
        } catch (Exception e) {
            if(transaction !=null){
                transaction.rollback();
            }
        }
         return loaiSP;
    }
    
    public boolean add(LoaiSP loaiSP) {     
         try {
            
            
            Session se = HibernateUtil.getFACTORY().openSession();

            LoaiSP lsp = new LoaiSP();
            
            lsp.setMa(loaiSP.getMa());
            
            lsp.setTen(loaiSP.getTen());
            
            lsp.setTrangThai(1);

            se.getTransaction().begin();
            se.save(lsp);
            se.getTransaction().commit();
            se.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
    
     // Update
    public boolean update(LoaiSP loaiSP) {
     try {
            Session se = HibernateUtil.getFACTORY().openSession();
            
            LoaiSP lsp = se.get(LoaiSP.class, loaiSP.getId());
            
            lsp.setMa(loaiSP.getMa());
            lsp.setTen(loaiSP.getTen());        
            lsp.setTrangThai(1);
            se.getTransaction().begin();
            se.save(lsp);
            se.getTransaction().commit();
            se.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
    
    
     public boolean delete(LoaiSP loaiSP) {
        try {
            Session se = HibernateUtil.getFACTORY().openSession();
            
            LoaiSP lsp = se.get(LoaiSP.class, loaiSP.getId());
            
            lsp.setTrangThai(0);

            se.getTransaction().begin();
            se.save(lsp);
            se.getTransaction().commit();
            se.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

}
