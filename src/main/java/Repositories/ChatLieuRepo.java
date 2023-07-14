/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChatLieu;
import Utilities.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Dell
 */
public class ChatLieuRepo {

    public List<ChatLieu> getAll() {
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM ChatLieu WHERE TrangThai = 1 ");
            List<ChatLieu> chatLieus = query.getResultList();
            return chatLieus;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(ChatLieu chatLieu) {
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            ChatLieu cl = new ChatLieu();
            cl.setMa(chatLieu.getMa());
            cl.setTen(chatLieu.getTen());
            cl.setTrangThai(1);

            session.getTransaction().begin();
            session.save(cl);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(ChatLieu chatLieu) {
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            ChatLieu cl = session.get(ChatLieu.class, chatLieu.getId());
            cl.setMa(chatLieu.getMa());
            cl.setTen(chatLieu.getTen());
            cl.setTrangThai(1);

            session.getTransaction().begin();
            session.save(cl);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(ChatLieu chatLieu) {
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            ChatLieu cl = session.get(ChatLieu.class, chatLieu.getId());
            cl.setTrangThai(0);
            
            session.getTransaction().begin();
            session.save(cl);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ChatLieu checkID(String id) {
        ChatLieu chatLieu = null;
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("FROM ChatLieu where id=:id");
        query.setParameter("id", id);
        try {
            chatLieu = (ChatLieu) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return chatLieu;
    }

    public static void main(String[] args) {
        ChatLieuRepo chatLieuRepo = new ChatLieuRepo();
        System.out.println(chatLieuRepo.getAll());
    }
}
