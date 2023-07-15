/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.LoaiSP;
import DomainModels.MauSac;
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
public class MauSacRepo {
    
      public List<MauSac> getAll() {
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM MauSac WHERE TrangThai = 1 ");
            List<MauSac> ms = query.getResultList();
            return ms;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(MauSac ms) {
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            MauSac mauSac = new MauSac();
            mauSac.setMa(ms.getMa());
            mauSac.setTen(ms.getTen());
            mauSac.setTrangThai(1);

            session.getTransaction().begin();
            session.save(mauSac);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(MauSac ms) {
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            MauSac mauSac = session.get(MauSac.class, ms.getId());
            mauSac.setMa(ms.getMa());
            mauSac.setTen(ms.getTen());
            mauSac.setTrangThai(1);

            session.getTransaction().begin();
            session.save(mauSac);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(MauSac ms) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            MauSac mauSac = session.get(MauSac.class, ms.getId());
            mauSac.setTrangThai(0);
            
            session.getTransaction().begin();
            session.delete(mauSac);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    public MauSac checkID(String id) {
//        ChatLieu chatLieu = null;
//        Session session = HibernateUtil.getFACTORY().openSession();
//        Query query = session.createQuery("FROM ChatLieu where id=:id");
//        query.setParameter("id", id);
//        try {
//            chatLieu = (ChatLieu) query.getSingleResult();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//        return chatLieu;
//    }
}
