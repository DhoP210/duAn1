/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Repositories;

import DomainModels.BaoHanh;
import Utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * 
 */
public class BaoHanhRepository {
     Session session = HibernateUtil.getFACTORY().openSession();

    public ArrayList<BaoHanh> getAll() {
        Query query = session.createQuery( "FROM BaoHanh ");

        ArrayList<BaoHanh> list = (ArrayList<BaoHanh>) query.getResultList();
        return list;
    }

    public String add(BaoHanh bh) {
        String check;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.save(bh);
            check = "Add thành công";
            transaction.commit();
        } catch (Exception e) {
            check = "Add thất bại";
        }
        return check;
    }

    public boolean getMa(String ma) {
        for (BaoHanh baohanh : getAll()) {
            if (ma.equalsIgnoreCase(baohanh.getMa())) {
                return true;
            }
        }
        return false;
    }

    public String update(BaoHanh bh) {
        String check;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(bh);
            check = "Update thành công";
            transaction.commit();
        } catch (Exception e) {
            check = "Update thất bại";
        }
        return check;
    }

    public Boolean delete(String ma) {

       Session session = HibernateUtil.getFACTORY().openSession();
        session = HibernateUtil.getFACTORY().openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        try {
            String hql = "delete BaoHanh where ma=:ma";
            org.hibernate.query.Query qr = session.createQuery(hql);
            qr.setParameter("ma", ma);
            qr.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;

    }

    public List<String> listcbbsize() {
        ArrayList<String> list = new ArrayList<>();
        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            String hql = "Select BaoHanh.baohanh from BaoHanh BaoHanh";
            TypedQuery<String> query = s.createQuery(hql, String.class);
            list = (ArrayList<String>) query.getResultList();
        }
        return list;
    }

}
