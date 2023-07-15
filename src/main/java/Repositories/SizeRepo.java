/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.MauSac;
import DomainModels.Size;
import Utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ADMIN
 */
public class SizeRepo {
  
    
    public List<Size> getAll(){
       try {
            Session session = HibernateUtil.getFACTORY().openSession(); //Ket noi DB thuc hien hien truy van
            org.hibernate.query.Query q = session.createQuery("FROM Size WHERE TrangThai = 1  order by ma "); //Tao cau truy van lay du lieu tu bang dong go
            List<Size> list = q.getResultList();
            return list;
        } catch (Exception e) {
            return null;
        }
    }
    
    
    public boolean add(Size size){
        try {
            Session ss = HibernateUtil.getFACTORY().openSession();
            Size s = new Size();
            s.setMa(size.getMa());
            s.setTen(size.getTen());         
            s.setTrangThai(1);

            ss.getTransaction().begin();
            ss.save(s);
            ss.getTransaction().commit();
            ss.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean getMa(String ma){
         for (Size size : getAll()) {
            if (ma.equalsIgnoreCase(size.getMa())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean update(Size size){
         try {
            Session ss = HibernateUtil.getFACTORY().openSession();
            Size s = ss.get(Size.class, size.getId());
            s.setMa(size.getMa());
            s.setTen(size.getTen());         
            s.setTrangThai(1);

            ss.getTransaction().begin();
            ss.saveOrUpdate(s);
            ss.getTransaction().commit();
            ss.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public String delete(String ma){
         Session session = HibernateUtil.getFACTORY().openSession();
        session = HibernateUtil.getFACTORY().openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        try {
            String hql = "delete Size where ma=:ma";
            Query qr = session.createQuery(hql);
            qr.setParameter("ma", ma);
            qr.executeUpdate();
            transaction.commit();
            return "Xóa thành công";
        } catch (Exception e) {

        }
        return "Xóa thất bại";
    }
    
     public List<String> listcbbsize() {
        ArrayList<String> list = new ArrayList<>();
        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            String hql = "Select Size.size from Size Size";
            TypedQuery<String> query = s.createQuery(hql, String.class);
            list = (ArrayList<String>) query.getResultList();
        }
        return list;
    }
}
