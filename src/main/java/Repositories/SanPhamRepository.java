/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;


import DomainModels.SanPham;
import Utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author PC
 */
public class SanPhamRepository {

    Session session = HibernateUtil.getFACTORY().openSession();

    public ArrayList<SanPham> getAll() {
        Query query = session.createQuery(
                "FROM SanPham ");

        ArrayList<SanPham> list = (ArrayList<SanPham>) query.getResultList();
        return list;
    }

    public String add(SanPham sp) {
        String check;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.save(sp);
            check = "Add thành công";
            transaction.commit();
        } catch (Exception e) {
            check = "Add thất bại";
        }
        return check;
    }

    public boolean getMa(String ma) {
        for (SanPham size : getAll()) {
            if (ma.equalsIgnoreCase(size.getMa())) {
                return true;
            }
        }
        return false;
    }

    public String update(SanPham sp) {
        String check;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(sp);
            check = "Update thành công";
            transaction.commit();
        } catch (Exception e) {
            check = "Update thất bại";
        }
        return check;
    }

    public String delete(String ma) {

        session = HibernateUtil.getFACTORY().openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        try {
            String hql = "delete SanPham where ma=:ma";
            Query qr = session.createQuery(hql);
            qr.setParameter("ma", ma);
            qr.executeUpdate();
//                   if (serult==0) {
//                       
//                   }
            transaction.commit();
            return "Xóa thành công";
        } catch (Exception e) {

        }
        return "Xóa thất bại";

    }

    public List<String> listcbbsize() {
        ArrayList<String> list = new ArrayList<>();
        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            String hql = "Select SanPham.sanpham from SanPham SanPham";
            TypedQuery<String> query = s.createQuery(hql, String.class);
            list = (ArrayList<String>) query.getResultList();
        }
        return list;
    }
}
